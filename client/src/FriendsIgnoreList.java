/* FriendsIgnoreList - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class274` (JODE-obfuscated).
 * Social-list message holder. Holds localized (EN/DE/FR/PT) strings for friends-list, ignore-list, and clan-channel events (e.g. 'Your friends list is full', 'not on your friends list', 'not in a clan channel').
 */

final class FriendsIgnoreList {
    static int anInt3477;
    static int anInt3478;
    static int anInt3479;
    static int anInt3480;
    /** EN/DE/FR/PT strings for this message key. */
    private final String[] localizedTexts;
    static int anInt3482;
    static FriendsIgnoreList aClass274_3483 = (new FriendsIgnoreList("This is the developer console. To close, press the `, \u00b2 or \u00a7 keys, or tap with four fingers on mobile.", "Das ist die Entwicklerkonsole. Zum Schlie\u00dfen: `, \u00b2 oder \u00a7, oder auf dem Handy mit vier Fingern tippen.", "Ceci est la console de d\u00e9veloppement. Pour la fermer: `, \u00b2 ou \u00a7, ou tapez avec quatre doigts sur mobile.", "Este \u00e9 o painel de controle do desenvolvedor. Para fechar, pressione `, \u00b2 ou \u00a7, ou toque com quatro dedos no celular."));
    static int anInt3484;
    static FriendsIgnoreList aClass274_3485 = (new FriendsIgnoreList("There was an error executing the command.", "Es gab einen Fehler beim Ausf\u00fchren des Befehls.", "Une erreur s'est produite lors de l'ex\u00e9cution de la commande.", "Houve um erro quando o comando foi executado."));
    static FriendsIgnoreList aClass274_3486 = new FriendsIgnoreList("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ");
    static FriendsIgnoreList aClass274_3487 = new FriendsIgnoreList("Cancel", "Abbrechen", "Annuler", "Cancelar");
    static FriendsIgnoreList aClass274_3488;
    static FriendsIgnoreList aClass274_3489;
    static FriendsIgnoreList aClass274_3490;
    static FriendsIgnoreList aClass274_3491;
    static FriendsIgnoreList aClass274_3492;
    static FriendsIgnoreList aClass274_3493;
    static FriendsIgnoreList aClass274_3494;
    static FriendsIgnoreList aClass274_3495;
    static FriendsIgnoreList aClass274_3496;
    static FriendsIgnoreList aClass274_3497;
    static FriendsIgnoreList aClass274_3498;
    static FriendsIgnoreList aClass274_3499;
    static FriendsIgnoreList aClass274_3500;
    static FriendsIgnoreList aClass274_3501;
    static FriendsIgnoreList aClass274_3502;
    static FriendsIgnoreList aClass274_3503;
    static FriendsIgnoreList aClass274_3504;
    static FriendsIgnoreList aClass274_3505;
    static FriendsIgnoreList aClass274_3506;
    static FriendsIgnoreList aClass274_3507;
    static FriendsIgnoreList aClass274_3508;
    static FriendsIgnoreList aClass274_3509;
    static FriendsIgnoreList aClass274_3510;
    static FriendsIgnoreList aClass274_3511;
    static FriendsIgnoreList aClass274_3512;
    static FriendsIgnoreList aClass274_3513;
    static FriendsIgnoreList aClass274_3514;
    static FriendsIgnoreList aClass274_3515;
    static FriendsIgnoreList aClass274_3516;
    static FriendsIgnoreList aClass274_3517;
    static FriendsIgnoreList aClass274_3518;
    static FriendsIgnoreList aClass274_3519;
    static FriendsIgnoreList aClass274_3520;
    static FriendsIgnoreList aClass274_3521;
    static FriendsIgnoreList aClass274_3522;
    static FriendsIgnoreList aClass274_3523;
    static FriendsIgnoreList aClass274_3524;
    static FriendsIgnoreList aClass274_3525;
    static FriendsIgnoreList aClass274_3526;
    static FriendsIgnoreList aClass274_3527;
    static FriendsIgnoreList aClass274_3528;
    static FriendsIgnoreList aClass274_3529;
    static FriendsIgnoreList aClass274_3530;
    static FriendsIgnoreList aClass274_3531;
    static FriendsIgnoreList aClass274_3532;
    static FriendsIgnoreList aClass274_3533;
    static FriendsIgnoreList aClass274_3534;
    static FriendsIgnoreList aClass274_3535;
    static FriendsIgnoreList aClass274_3536;
    static FriendsIgnoreList aClass274_3537;
    static FriendsIgnoreList aClass274_3538;
    static FriendsIgnoreList aClass274_3539;
    static FriendsIgnoreList aClass274_3540;
    static FriendsIgnoreList aClass274_3541;
    static FriendsIgnoreList aClass274_3542;
    static FriendsIgnoreList aClass274_3543;
    static FriendsIgnoreList aClass274_3544;
    static FriendsIgnoreList aClass274_3545;
    static FriendsIgnoreList aClass274_3546;
    static DisplayModeManagerContainer56 aClass190_3547;

    /** True if tile flags include walk-block / roof-style collision bits (0x18 or 0x220==544). */
    static final boolean hasCollisionBlockFlags(int i, int i_0_, int i_1_) {
        if (i_1_ <= 28) clearStatics(108);
        anInt3478++;
        return (0x18 & i) != 0 | (i & 0x220) == 544;
    }

    public static void clearStatics(int i) {
        aClass274_3523 = null;
        aClass274_3530 = null;
        aClass274_3533 = null;
        aClass274_3509 = null;
        aClass274_3503 = null;
        aClass274_3500 = null;
        aClass274_3537 = null;
        aClass274_3504 = null;
        aClass274_3505 = null;
        aClass274_3540 = null;
        aClass274_3514 = null;
        aClass274_3515 = null;
        aClass274_3531 = null;
        aClass274_3543 = null;
        if (i > -88) clearOccluders((byte) -47);
        aClass274_3542 = null;
        aClass274_3501 = null;
        aClass274_3519 = null;
        aClass274_3522 = null;
        aClass274_3485 = null;
        aClass274_3483 = null;
        aClass274_3488 = null;
        aClass274_3496 = null;
        aClass274_3497 = null;
        aClass274_3526 = null;
        aClass274_3538 = null;
        aClass274_3487 = null;
        aClass274_3507 = null;
        aClass274_3493 = null;
        aClass274_3520 = null;
        aClass274_3511 = null;
        aClass274_3490 = null;
        aClass274_3532 = null;
        aClass274_3508 = null;
        aClass274_3541 = null;
        aClass274_3492 = null;
        aClass274_3517 = null;
        aClass274_3499 = null;
        aClass274_3498 = null;
        aClass274_3529 = null;
        aClass274_3516 = null;
        aClass274_3502 = null;
        aClass274_3544 = null;
        aClass274_3518 = null;
        aClass274_3528 = null;
        aClass274_3510 = null;
        aClass274_3513 = null;
        aClass274_3489 = null;
        aClass274_3491 = null;
        aClass274_3494 = null;
        aClass274_3524 = null;
        aClass274_3486 = null;
        aClass274_3525 = null;
        aClass274_3521 = null;
        aClass274_3512 = null;
        aClass274_3534 = null;
        aClass274_3536 = null;
        aClass274_3539 = null;
        aClass190_3547 = null;
        aClass274_3545 = null;
        aClass274_3535 = null;
        aClass274_3506 = null;
        aClass274_3527 = null;
        aClass274_3495 = null;
        aClass274_3546 = null;
    }

    /** Close open interface containers and clear the active top-level interface ref. */
    static final void closeInterfaces(byte i, boolean bool) {
        if (i > -4) clearStatics(-6);
        anInt3484++;
        DisplayModeManagerContainer89.anInt8374++;
        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(NodeSub34.aClass351_6970, DisplayModeManagerContainer64.aClass77_9029, -109);
        HashNodeSub14.enqueueOutboundPacket(37, class348_sub47);
        for (NodeSub41 class348_sub41 = (NodeSub41) Component15.aClass356_4915.first(0); class348_sub41 != null; class348_sub41 = (NodeSub41) Component15.aClass356_4915.next(0)) {
            if (!class348_sub41.isLinked((byte) 4)) {
                class348_sub41 = (NodeSub41) Component15.aClass356_4915.first(0);
                if (class348_sub41 == null) break;
            }
            if (class348_sub41.anInt7053 == 0) Component162.method1118(true, bool, class348_sub41, 2533);
        }
        if (Component297.aClass46_4730 != null) {
            Component111.markInterfaceDirty(-9343, Component297.aClass46_4730);
            Component297.aClass46_4730 = null;
        }
    }

    /** Drop cached HUD / minimap sprites. */
    static final void clearHudSprites(int i) {
        RSARequest.aClass105_9658 = null;
        RSARequest.aClass105_9659 = null;
        RadixParser.aClass105_2309 = null;
        DisplayModeManagerContainer196.aClass105Array4234 = null;
        Component221.aClass105_1800 = null;
        anInt3477++;
        int i_2_ = 89 / ((-74 - i) / 42);
        NodeSub5.aClass105_6627 = null;
        OutputStream_Sub2.aClass105_106 = null;
        DisplayModeManagerContainer74.aClass105_4808 = null;
        Component338.aClass105_1706 = null;
    }

    /** Free scene occluder arrays and reset occluder counts. */
    static final void clearOccluders(byte i) {
        if (Component335.aClass338Array2034 != null) {
            for (int i_3_ = 0; i_3_ < RadixText.occluderCountA; i_3_++)
                Component335.aClass338Array2034[i_3_] = null;
            Component335.aClass338Array2034 = null;
        }
        anInt3480++;
        if (DisplayModeManagerContainer104.aClass338Array10330 != null) {
            for (int i_4_ = 0; i_4_ < Component325.occluderCountB; i_4_++)
                DisplayModeManagerContainer104.aClass338Array10330[i_4_] = null;
            DisplayModeManagerContainer104.aClass338Array10330 = null;
        }
        if (InterfaceRenderer.aClass338Array5060 != null) {
            for (int i_5_ = 0; i_5_ < ComponentSettings.anInt7101; i_5_++)
                InterfaceRenderer.aClass338Array5060[i_5_] = null;
            InterfaceRenderer.aClass338Array5060 = null;
        }
        Component160.anIntArrayArrayArray4356 = null;
        int i_6_ = 36 % ((-81 - i) / 38);
        DisplayModeManagerContainer194.anIntArray5091 = null;
        HashNodeSub19.aClass338Array9700 = null;
        Component314.anInt3872 = Component328.anInt1480 = -1;
    }

    private FriendsIgnoreList(String string, String string_7_, String string_8_, String string_9_) {
        try {
            localizedTexts = new String[]{string, string_7_, string_8_, string_9_};
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("va.<init>(" + (string != null ? "{...}" : "null") + ',' + (string_7_ != null ? "{...}" : "null") + ',' + (string_8_ != null ? "{...}" : "null") + ',' + (string_9_ != null ? "{...}" : "null") + ')'));
        }
    }

    public final String toString() {
        anInt3482++;
        throw new IllegalStateException();
    }

    /** @param i language index ({@link ObjectDeserializer#languageId}); {@code i_10_} must be 544. */
    final String getLocalized(int i, int i_10_) {
        if (i_10_ != 544) clearHudSprites(126);
        anInt3479++;
        return localizedTexts[i];
    }

    static {
        new FriendsIgnoreList("#Player", "#Spieler", "#Joueur", "#Jogador");
        aClass274_3488 = new FriendsIgnoreList("Members object", "Gegenstand f\u00fcr Mitglieder", "Objet d'abonn\u00e9s", "Objeto para membros");
        new FriendsIgnoreList("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        new FriendsIgnoreList("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "\u00c9changez ce re\u00e7u contre l'objet correspondant dans la banque de votre choix.", "V\u00e1 a qualquer banco para trocar esta nota pelo objeto equivalente.");
        aClass274_3489 = new FriendsIgnoreList("Discard", "Ablegen", "Jeter", "Descartar");
        aClass274_3490 = new FriendsIgnoreList("Take", "Nehmen", "Prendre", "Pegar");
        aClass274_3491 = new FriendsIgnoreList("Drop", "Fallen lassen", "Poser", "Largar");
        new FriendsIgnoreList("Ok", "Okay", "OK", "Ok");
        new FriendsIgnoreList("Select", "Ausw\u00e4hlen", "S\u00e9lectionner", "Selecionar");
        aClass274_3492 = new FriendsIgnoreList("Continue", "Weiter", "Continuer", "Continuar");
        new FriendsIgnoreList("Invalid player name.", "Unzul\u00e4ssiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inv\u00e1lido.");
        new FriendsIgnoreList("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-m\u00eame !", "Voc\u00ea n\u00e3o pode denunciar a si pr\u00f3prio!");
        new FriendsIgnoreList("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelversto\u00df gemeldet!", "Vous avez d\u00e9j\u00e0 signal\u00e9 un abus il y a moins d'une minute ! N'abusez pas du syst\u00e8me !", "Voc\u00ea j\u00e1 enviou uma den\u00fancia de abuso h\u00e1 menos de um minuto. N\u00e3o abuse deste sistema!");
        new FriendsIgnoreList(null, "Dieses System darf nicht missbraucht werden!", null, null);
        new FriendsIgnoreList("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identit\u00e9.", "Voc\u00ea n\u00e3o pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        new FriendsIgnoreList("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconna\u00eetre les mod\u00e9rateurs Jagex \u00e0 la couronne dor\u00e9e en regard de leur nom.", "Os moderadores da Jagex s\u00e3o identificados por uma coroa dourada pr\u00f3xima ao \u007fnome.");
        new FriendsIgnoreList("You can report that person under a different rule.", "Diese Person kann bez\u00fcglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux r\u00e8gles.", "Voc\u00ea n\u00e3o pode denunciar essa pessoa de acordo com uma regra diferente.");
        new FriendsIgnoreList("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien re\u00e7u votre rapport d'abus.", "Obrigado. Sua den\u00fancia de abuso foi recebida.");
        new FriendsIgnoreList("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme \u00fcberlastet", "Impossible de signaler un abus - Erreur syst\u00e8me", "Sistema ocupado. N\u00e3o foi poss\u00edvel enviar sua den\u00fancia de abuso.");
        new FriendsIgnoreList("Invalid name", "Unzul\u00e4ssiger Name!", "Nom incorrect", "Nome inv\u00e1lido");
        new FriendsIgnoreList("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        new FriendsIgnoreList("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter \u00e0 un serveur d'abonn\u00e9s pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        new FriendsIgnoreList("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'int\u00e9ressant.", "Nada de interessante acontece.");
        new FriendsIgnoreList("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Voc\u00ea n\u00e3o consegue alcan\u00e7ar isso.");
        new FriendsIgnoreList("Invalid teleport!", "Unzul\u00e4ssiger Teleport!", "T\u00e9l\u00e9portation non valide !", "Teleporte inv\u00e1lido!");
        new FriendsIgnoreList("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter \u00e0 un serveur d'abonn\u00e9s pour aller \u00e0 cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        new FriendsIgnoreList("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel adicionar o amigo. O sistema est\u00e1 ocupado.");
        new FriendsIgnoreList("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "N\u00e3o foi poss\u00edvel adicionar um amigo - jogador desconhecido.");
        new FriendsIgnoreList("Unable to add name - system busy.", "Der Name konnte nicht hinzugef\u00fcgt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel adicionar o nome. O sistema est\u00e1 ocupado.");
        new FriendsIgnoreList("Unable to add name - unknown player.", "Name konnte nicht hinzugef\u00fcgt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "N\u00e3o foi poss\u00edvel adicionar um nome - jogador desconhecido.");
        aClass274_3493 = (new FriendsIgnoreList("Your friends list is full, max of 200 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (200 noms maximum pour la version gratuite et 200 pour les abonn\u00e9s).", "Sua lista de amigos est\u00e1 cheia. O limite \u00e9 200 para usu\u00e1rios n\u00e3o pagantes, e 200 para membros."));
        aClass274_3494 = (new FriendsIgnoreList(null, "Mitglieder k\u00f6nnen 200 Freunde hinzuf\u00fcgen, freie Spieler nur 200.", null, null));
        new FriendsIgnoreList("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel excluir o amigo. O sistema est\u00e1 ocupado.");
        new FriendsIgnoreList("Unable to delete name - system busy.", "Name konnte nicht gel\u00f6scht werden - Systemfehler.", "Impossible d'effacer le nom - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel deletar o nome - sistema ocupado.");
        new FriendsIgnoreList("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - syst\u00e8me occup\u00e9.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O sistema est\u00e1 ocupado.");
        new FriendsIgnoreList("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 dispon\u00edvel.");
        new FriendsIgnoreList(null, "der Spieler ist momentan nicht verf\u00fcgbar.", null, null);
        new FriendsIgnoreList("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "N\u00e3o foi poss\u00edvel enviar a mensagem. O jogador n\u00e3o est\u00e1 na sua lista de amigos.");
        new FriendsIgnoreList(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        new FriendsIgnoreList("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous r\u00e9v\u00e9liez votre mot de passe \u00e0 quelqu'un - ne faites jamais \u00e7a !", "Parece que voc\u00ea est\u00e1 revelando sua senha a algu\u00e9m. N\u00e3o fa\u00e7a isso!");
        new FriendsIgnoreList("If you are not, please change your password to something more obscure!", "nicht der Fall ist, \u00e4ndere dein Passwort zu einem ungew\u00f6hnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins \u00e9vidente !", "Caso n\u00e3o esteja, altere sua senha para algo mais obscuro!");
        new FriendsIgnoreList("Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", "N\u00e3o \u00e9 poss\u00edvel enviar a mensagem. Defina um nome de personagem antes, fazendo login no jogo.");
        new FriendsIgnoreList(null, "indem du dich ins Spiel einloggst.", null, null);
        new FriendsIgnoreList("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option k\u00f6nnen nur Spieler gemeldet werden,", "Cette r\u00e8gle n'est invocable que pour les discussions ou \u00e9changes r\u00e9cents.", "Para essa regra, voc\u00ea s\u00f3 pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        new FriendsIgnoreList(null, "die k\u00fcrzlich gesprochen oder gehandelt haben.", null, null);
        new FriendsIgnoreList("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsph\u00e4ren-Modus aktiviert.", "Ce joueur est d\u00e9connect\u00e9 ou en mode priv\u00e9.", "O jogador est\u00e1 offline ou est\u00e1 com o modo de privacidade ativado.");
        new FriendsIgnoreList("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt k\u00f6nnen derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide \u00e0 un joueur de ce serveur \u00e0 l'heure actuelle.", "Voc\u00ea n\u00e3o pode enviar uma mensagem de papo r\u00e1pido para um jogador neste mundo neste momento.");
        new FriendsIgnoreList(null, "geschickt werden.", null, null);
        new FriendsIgnoreList("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur \u00e0 messagerie rapide et ne peut pas recevoir votre message.", "Este jogador n\u00e3o pode receber sua mensagem porque est\u00e1 em um mundo de papo r\u00e1pido.");
        new FriendsIgnoreList("Chat disabled", "Deaktiviert", "Messagerie d\u00e9sactiv\u00e9e", "Bate-papo desativado");
        new FriendsIgnoreList("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        new FriendsIgnoreList("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'\u00eates pas dans un canal de clan.", "No momento voc\u00ea n\u00e3o est\u00e1 em um canal de cl\u00e3.");
        new FriendsIgnoreList("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 parler dans ce canal de clan.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para conversar neste canal de cl\u00e3.");
        new FriendsIgnoreList("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es sp\u00e4ter erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez r\u00e9essayer ult\u00e9rieurement.", "Erro ao enviar mensagem ao canal de cl\u00e3. Tente de novo depois!");
        new FriendsIgnoreList("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'\u00eatre d\u00e9connect\u00e9(e) de votre canal pr\u00e9c\u00e9dent.", "Aguarde at\u00e9 se desconectar do canal anterior.");
        new FriendsIgnoreList("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'\u00eates dans aucun canal \u00e0 l'heure actuelle.", "No momento voc\u00ea n\u00e3o est\u00e1 em um canal.");
        new FriendsIgnoreList("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        new FriendsIgnoreList("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicita\u00e7\u00e3o para deixar o canal...");
        new FriendsIgnoreList("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal d\u00e9j\u00e0 en cours - veuillez patienter...", "J\u00e1 h\u00e1 uma tentativa de entrar em um canal. Aguarde...");
        new FriendsIgnoreList("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie d\u00e9j\u00e0 effectu\u00e9e - veuillez patienter...", "Solicita\u00e7\u00e3o de sa\u00edda j\u00e1 em andamento. Aguarde...");
        new FriendsIgnoreList("Invalid channel name entered!", "Ung\u00fcltiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inv\u00e1lido!");
        new FriendsIgnoreList("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es sp\u00e4ter erneut.", "Impossible de participer \u00e0 une discussion de clan pour le moment - veuillez r\u00e9essayer ult\u00e9rieurement.", "N\u00e3o foi poss\u00edvel entrar no bate-papo do cl\u00e3 dessa vez. Tente de novo depois!");
        new FriendsIgnoreList("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do cl\u00e3 agora ");
        new FriendsIgnoreList("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do cl\u00e3 do jogador: ");
        new FriendsIgnoreList("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, ins\u00e9rez le symbole / au d\u00e9but de chaque ligne.", "Para falar, comece cada linha de conversa com o s\u00edmbolo /.");
        new FriendsIgnoreList("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es sp\u00e4ter erneut.", "Erreur lors de la connexion au canal de clan - veuillez r\u00e9essayer ult\u00e9rieurement.", "Erro ao entrar no canal do cl\u00e3. Tente de novo depois!");
        new FriendsIgnoreList("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chatr\u00e4ume betreten - bitte versuch es sp\u00e4ter.", "Vous \u00eates temporairement exclu des canaux - veuillez r\u00e9essayer ult\u00e9rieurement.", "Voc\u00ea est\u00e1 temporariamente impedido de entrar em canais. Tente de novo depois!");
        new FriendsIgnoreList("The channel you tried to join does not exist.", "Der von dir gew\u00fcnschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que voc\u00ea tentou acessar n\u00e3o existe.");
        new FriendsIgnoreList("The channel you tried to join is currently full.", "Der von dir gew\u00fcnschte Chatraum ist derzeit \u00fcberf\u00fcllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que voc\u00ea tentou acessar est\u00e1 cheio no momento.");
        new FriendsIgnoreList("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez \u00e9lev\u00e9 pour rejoindre ce canal de clan.", "Sua posi\u00e7\u00e3o n\u00e3o \u00e9 alta o suficiente para voc\u00ea entrar nesse canal de cl\u00e3.");
        new FriendsIgnoreList("You are temporarily banned from this clan channel.", "Du wurdest tempor\u00e4r aus diesem Chatraum verbannt.", "Vous \u00eates temporairement exclu de ce canal de clan.", "Voc\u00ea est\u00e1 temporariamente vetado de entrar nesse canal de cl\u00e3.");
        new FriendsIgnoreList("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 rejoindre le canal de clan de cet utilisateur.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para entrar no canal de cl\u00e3 desse usu\u00e1rio.");
        new FriendsIgnoreList(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        new FriendsIgnoreList(" left the channel.", " hat den Chatraum verlassen.", " a quitt\u00e9 le canal.", " deixou o canal.");
        new FriendsIgnoreList(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a \u00e9t\u00e9 expuls\u00e9 du canal.", " foi expulso do canal.");
        new FriendsIgnoreList("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez \u00e9t\u00e9 expuls\u00e9 du canal.", "Voc\u00ea foi expulso do canal.");
        new FriendsIgnoreList("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez \u00e9t\u00e9 supprim\u00e9 de ce canal.", "Voc\u00ea foi retirado desse canal.");
        new FriendsIgnoreList("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitt\u00e9 le canal.", "Voc\u00ea saiu do canal.");
        new FriendsIgnoreList("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activ\u00e9 !", "Seu canal de cl\u00e3 j\u00e1 est\u00e1 ativado!");
        new FriendsIgnoreList("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur \u00ab Participer \u00bb et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        new FriendsIgnoreList("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est d\u00e9sactiv\u00e9.", "Seu canal de cl\u00e3 foi desativado!");
        new FriendsIgnoreList("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser des utilisateurs de ce canal.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar usu\u00e1rios neste canal.");
        new FriendsIgnoreList("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'\u00eates pas autoris\u00e9 \u00e0 expulser cet utilisateur.", "Voc\u00ea n\u00e3o tem permiss\u00e3o para expulsar este usu\u00e1rio.");
        new FriendsIgnoreList("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usu\u00e1rio n\u00e3o est\u00e1 no canal.");
        new FriendsIgnoreList("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelversto\u00dfes wurdest du vor\u00fcbergehend stumm geschaltet.", "La messagerie instantan\u00e9e a \u00e9t\u00e9 temporairement bloqu\u00e9e suite \u00e0 une infraction.", "Voc\u00ea foi temporariamente vetado por ter violado uma regra.");
        new FriendsIgnoreList("This mute will remain for a further ", "Diese Stummschaltung gilt f\u00fcr weitere ", "Votre acc\u00e8s restera bloqu\u00e9 encore ", "Este veto permanecer\u00e1 por mais ");
        new FriendsIgnoreList(" days.", " Tage.", " jours.", " dias.");
        new FriendsIgnoreList("You will be un-muted within 24 hours.", "Du wirst innerhalb der n\u00e4chsten 24 Stunden wieder sprechen k\u00f6nnen.", "Vous aurez \u00e0 nouveau acc\u00e8s \u00e0 la messagerie instantan\u00e9e dans 24 heures.", "O veto ser\u00e1 retirado dentro de 24 horas.");
        new FriendsIgnoreList("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour \u00e9viter un nouveau blocage, lisez le r\u00e8glement.", "Para evitar outros vetos, leia as regras.");
        new FriendsIgnoreList("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel versto\u00dfen hast.", "L'acc\u00e8s \u00e0 la messagerie instantan\u00e9e vous a d\u00e9finitivement \u00e9t\u00e9 retir\u00e9 suite \u00e0 une infraction.", "Voc\u00ea foi permanentemente vetado por ter violado uma regra.");
        aClass274_3495 = new FriendsIgnoreList("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
        aClass274_3496 = new FriendsIgnoreList("Profiling...", "Profiling...", "Profilage...", "Profiling...");
        aClass274_3497 = new FriendsIgnoreList("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conex\u00e3o perdida.");
        aClass274_3498 = (new FriendsIgnoreList("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de r\u00e9tablissement.", "Tentando reestabelecer conex\u00e3o. Aguarde."));
        aClass274_3499 = new FriendsIgnoreList("Checking for updates - ", "Suche nach Updates - ", "V\u00e9rification des mises \u00e0 jour - ", "Verificando atualiza\u00e7\u00f5es - ");
        aClass274_3500 = new FriendsIgnoreList("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ", "Carregando atualiza\u00e7\u00f5es - ");
        new FriendsIgnoreList("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
        new FriendsIgnoreList("Loaded config", "Konfig geladen.", "Fichiers config charg\u00e9s", "Config carregada");
        new FriendsIgnoreList("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
        new FriendsIgnoreList("Loaded sprites", "Sprites geladen.", "Sprites charg\u00e9s", "Sprites carregados");
        new FriendsIgnoreList("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
        new FriendsIgnoreList("Loaded wordpack", "Wordpack geladen.", "Module texte charg\u00e9", "Pacote de palavras carregado");
        new FriendsIgnoreList("Loading interfaces - ", "Lade Benutzeroberfl\u00e4che - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        new FriendsIgnoreList("Loaded interfaces", "Benutzeroberfl\u00e4che geladen.", "Interfaces charg\u00e9es", "Interfaces carregadas");
        new FriendsIgnoreList("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        new FriendsIgnoreList("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces charg\u00e9es", "Interfaces carregadas");
        new FriendsIgnoreList("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");
        new FriendsIgnoreList("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires charg\u00e9es", "Fontes principais carregadas");
        new FriendsIgnoreList("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-m\u00fandi - ");
        new FriendsIgnoreList("Loaded world map", "Weltkarte geladen", "Mappemonde charg\u00e9e", "Mapa-m\u00fandi carregado");
        new FriendsIgnoreList("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        new FriendsIgnoreList("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs charg\u00e9e", "Dados da lista de mundos carregados");
        new FriendsIgnoreList("Loaded client variable data", "Client-Variablen geladen", "Variables du client charg\u00e9es", "As vari\u00e1veis do sistema foram carregadas");
        aClass274_3501 = new FriendsIgnoreList("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
        new FriendsIgnoreList("Please close the interface you have open before using 'Report Abuse'.", "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        new FriendsIgnoreList(null, "bevor du die Option 'Regelversto\u00df melden' benutzt.", null, null);
        new FriendsIgnoreList("System update in: ", "System-Update in: ", "Mise \u00e0 jour syst\u00e8me dans : ", "Atualiza\u00e7\u00e3o do sistema em: ");
        aClass274_3502 = new FriendsIgnoreList(" has logged in.", " loggt sich ein.", " s'est connect\u00e9.", " entrou no jogo.");
        aClass274_3503 = new FriendsIgnoreList(" has logged out.", " loggt sich aus.", " s'est d\u00e9connect\u00e9.", " saiu do jogo.");
        aClass274_3504 = new FriendsIgnoreList("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "N\u00e3o \u00e9 poss\u00edvel encontrar ");
        new FriendsIgnoreList("Use", "Benutzen", "Utiliser", "Usar");
        aClass274_3505 = new FriendsIgnoreList("Examine", "Untersuchen", "Examiner", "Examinar");
        aClass274_3506 = new FriendsIgnoreList("Attack", "Angreifen", "Attaquer", "Atacar");
        aClass274_3507 = new FriendsIgnoreList("Choose Option", "W\u00e4hl eine Option", "Choisir une option", "Selecionar op\u00e7\u00e3o");
        aClass274_3508 = new FriendsIgnoreList(" more options", " weitere Optionen", " autres options", " mais op\u00e7\u00f5es");
        aClass274_3509 = new FriendsIgnoreList("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para c\u00e1");
        aClass274_3510 = new FriendsIgnoreList("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para c\u00e1");
        aClass274_3511 = new FriendsIgnoreList("level: ", "Stufe: ", "niveau ", "n\u00edvel: ");
        aClass274_3512 = new FriendsIgnoreList("skill: ", "Fertigkeit: ", "comp\u00e9tence ", "habilidade: ");
        aClass274_3513 = new FriendsIgnoreList("rating: ", "Kampfstufe: ", "classement ", "qualifica\u00e7\u00e3o: ");
        aClass274_3514 = new FriendsIgnoreList("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
        new FriendsIgnoreList("Close", "Bitte schlie\u00df die momentan ge\u00f6ffnete Benutzeroberfl\u00e4che,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton \u00ab Signaler un abus \u00bb.", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        aClass274_3515 = new FriendsIgnoreList(" ", ": ", " ", " ");
        aClass274_3516 = new FriendsIgnoreList("M", "M", "M", "M");
        aClass274_3517 = new FriendsIgnoreList("M", "M", "M", "M");
        aClass274_3518 = new FriendsIgnoreList("K", "T", "K", "K");
        aClass274_3519 = new FriendsIgnoreList("K", "T", "K", "K");
        new FriendsIgnoreList("From", "Von:", "De", "De");
        aClass274_3520 = new FriendsIgnoreList("Self", "Mich", "Moi", "Eu");
        aClass274_3521 = new FriendsIgnoreList(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est d\u00e9j\u00e0 dans votre liste d'amis.", " j\u00e1 est\u00e1 na sua lista de amigos.");
        aClass274_3522 = (new FriendsIgnoreList("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados est\u00e1 cheia. O limite \u00e9 100 usu\u00e1rios."));
        aClass274_3523 = new FriendsIgnoreList(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est d\u00e9j\u00e0 dans votre liste noire.", " j\u00e1 est\u00e1 na sua lista de ignorados.");
        aClass274_3524 = (new FriendsIgnoreList("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste d'amis.", "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de amigos."));
        aClass274_3525 = (new FriendsIgnoreList("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom \u00e0 votre liste noire.", "Voc\u00ea n\u00e3o pode adicionar a si pr\u00f3prio \u00e0 sua lista de ignorados."));
        new FriendsIgnoreList("Changes will take effect on your clan in the next 60 seconds.", "Die \u00c4nderungen am Chatraum werden innerhalb von 60 Sekunden g\u00fcltig.", "Les modifications seront apport\u00e9es \u00e0 votre clan dans les prochaines 60 secondes.", "As altera\u00e7\u00f5es passar\u00e3o a valer no seu cl\u00e3 nos pr\u00f3ximos 60 segundos.");
        aClass274_3526 = new FriendsIgnoreList("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        aClass274_3527 = new FriendsIgnoreList(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");
        aClass274_3528 = new FriendsIgnoreList("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
        aClass274_3529 = new FriendsIgnoreList(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");
        aClass274_3530 = new FriendsIgnoreList("yellow:", "gelb:", "jaune:", "amarelo:");
        aClass274_3531 = new FriendsIgnoreList("red:", "rot:", "rouge:", "vermelho:");
        aClass274_3532 = new FriendsIgnoreList("green:", "gr\u00fcn:", "vert:", "verde:");
        aClass274_3533 = new FriendsIgnoreList("cyan:", "blaugr\u00fcn:", "cyan:", "cyan:");
        aClass274_3534 = new FriendsIgnoreList("purple:", "lila:", "violet:", "roxo:");
        aClass274_3535 = new FriendsIgnoreList("white:", "weiss:", "blanc:", "branco:");
        aClass274_3536 = new FriendsIgnoreList("flash1:", "blinken1:", "clignotant1:", "flash1:");
        aClass274_3537 = new FriendsIgnoreList("flash2:", "blinken2:", "clignotant2:", "flash2:");
        aClass274_3538 = new FriendsIgnoreList("flash3:", "blinken3:", "clignotant3:", "brilho3:");
        aClass274_3539 = new FriendsIgnoreList("glow1:", "leuchten1:", "brillant1:", "brilho1:");
        aClass274_3540 = new FriendsIgnoreList("glow2:", "leuchten2:", "brillant2:", "brilho2:");
        aClass274_3541 = new FriendsIgnoreList("glow3:", "leuchten3:", "brillant3:", "brilho3:");
        aClass274_3542 = new FriendsIgnoreList("wave:", "welle:", "ondulation:", "onda:");
        aClass274_3543 = new FriendsIgnoreList("wave2:", "welle2:", "ondulation2:", "onda2:");
        aClass274_3544 = new FriendsIgnoreList("shake:", "sch\u00fctteln:", "tremblement:", "tremor:");
        aClass274_3545 = new FriendsIgnoreList("scroll:", "scrollen:", "d\u00e9roulement:", "rolagem:");
        aClass274_3546 = new FriendsIgnoreList("slide:", "gleiten:", "glissement:", "deslizamento:");
    }
}
