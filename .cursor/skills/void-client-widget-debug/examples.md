# Examples

## Quick prayer orb (desktop, English)

### Symptom

- Learn on prayer **book** icons worked (`Activate` / `Deactivate`, shared `packed=17760264`, distinct `child`)
- Learn on **quick prayer** never appeared
- After binding, first ↓ fired `Turn quick prayers on`; second ↓ → `Quick prayer widget not found`
- Manual click still worked

### Evidence from logs

Right-click book only:

```
PRAY-DUMP packed=17760264 child=0 … opts=[0]='Activate'→PRAYER/indiv
```

openInterfaces scan (no right-click on orb):

```
ORB-SCAN packed=49086465 … orb=true
  opts= [0]='Turn quick prayers on'→… [1]='Select quick prayers'→…/setup
```

After first successful fire (prayers on):

```
opts= [0]='Turn prayers off'→null [1]='Select quick prayers'→…/setup
```

`→null` = matcher required `"quick"` and missed the active-state label.

### Fixes applied

1. Match `Turn quick prayers on/off` **and** `Turn prayers on/off`
2. Never learn/fire `Select quick prayers` (setup)
3. Persist orb `packedId` on learn (was `-1`)
4. Fire uses current orb option (on or off), client-thread queued

### Verify

```
INJECT kind=QUICK_PRAYER … action='Turn quick prayers on' packed=49086465
fire option 'Turn quick prayers on' …
fire option 'Turn prayers off' …    # second press
```

No `widget not found`.

## Shared packedId prayer icons

```
packed=17760264 child=0  → first icon
packed=17760264 child=1  → second icon
```

Learn/fire must store and restore `childIndex` via `NodeSub22.getChildComponent`.
