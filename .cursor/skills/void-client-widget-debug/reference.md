# Widget debug — reference

## packedId decode

```
groupId  = packedId >>> 16
childId  = packedId & 0xffff
```

Example: `49086465` → group `749`, child `1` (minimap quick-prayer orb on this build).  
Example: `17760264` → group `271`, child `8` (prayer-book layer; icons distinguished by `childIndex`).

## childIndex vs packedId

Prayer-book icons often share the **parent** `packedId`. Only `childIndex`
(and/or `NodeSub22.getChildComponent`) picks the right icon. Storing packed
alone → always first / wrong / not found.

## getComponentOption vs optionLabels

`Component63.getComponentOption` can return null / `Hidden-*` while
`optionLabels[i]` still has text. Dump **both**. Fire/learn should use the same
fallback as inject.

## openInterfaces scan

When right-click never dumps the target:

1. Walk `DefinitionSub33.openInterfaces[g][i]` and `c.children[k]`
2. Skip `hidden`
3. Keep widgets whose options/labels mention target keywords
4. Throttle (once per packedId / every N seconds) — full-tree print every tick melts the console

Pseudo:

```java
for (DisplayModeManagerContainer57[] all : DefinitionSub33.openInterfaces) {
  if (all == null) continue;
  for (DisplayModeManagerContainer57 c : all) {
    if (c == null || c.hidden) continue;
    dumpIfCandidate(c);
    if (c.children != null)
      for (DisplayModeManagerContainer57 kid : c.children)
        if (kid != null && !kid.hidden) dumpIfCandidate(kid);
  }
}
```

## ifPress

`void-osrs ifPress id=<packedId> type=… size=WxH xy=…` — cursor hit test.  
Compare `id` to dump `packed=`. Type `5` is often a graphic/button; type `0` layer.

## Client-thread rule

Pad / GameController callbacks are **not** the game thread. Queue fires
(`pendingFire`) and drain from `JoystickAlias.clientTick()` (called from
`client` loop). Direct `ColoredTextBuilder.processMenuAction` off-thread → UI freeze.

## Matcher traps

| Trap | What to do |
|------|------------|
| Assumed `"Setup Quick-prayers"` | Dump first — may be `"Select quick prayers"` |
| Assumed `"Activate"` on orb | May be `"Turn quick prayers on"` |
| Only matched "on" text | Active state may drop words: `"Turn prayers off"` |
| Matched setup as toggle | Filter `setup` / `select` / `choose` |
| Learn stored `itemId=-1` for UI | Persist `param1` / `identifier` packedId |
| Locale / PT strings | Match substrings carefully; dump on device language |

## Useful grep prefixes

```
void-osrs ifPress
void-osrs joy-alias PRAY-DUMP
void-osrs joy-alias ORB-SCAN
void-osrs joy-alias INJECT
void-osrs joy-alias fire option
void-osrs joy-alias learn armed
void-osrs widget-dump
```
