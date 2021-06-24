package com.example.pedometerpixeldungeon.mainsrc.scenes;

import android.util.Log;
import android.widget.Toast;

import com.example.pedometerpixeldungeon.mainsrc.Assets;
import com.example.pedometerpixeldungeon.mainsrc.Dungeon;
import com.example.pedometerpixeldungeon.mainsrc.DungeonTilemap;
import com.example.pedometerpixeldungeon.mainsrc.PedometerPixelDungeon;
import com.example.pedometerpixeldungeon.mainsrc.actors.mobs.Mob;
import com.example.pedometerpixeldungeon.noosa.Camera;
import com.example.pedometerpixeldungeon.noosa.Group;
import com.example.pedometerpixeldungeon.noosa.SkinnedBlock;
import com.example.pedometerpixeldungeon.noosa.audio.Music;

public class GameScene extends PixelScene {
    private static final String TXT_WELCOME			= "Welcome to the level %d of Pixel Dungeon!";
    private static final String TXT_WELCOME_BACK	= "Welcome back to the level %d of Pixel Dungeon!";
    private static final String TXT_NIGHT_MODE		= "Be cautious, since the dungeon is even more dangerous at night!";

    private static final String TXT_CHASM	= "Your steps echo across the dungeon.";
    private static final String TXT_WATER	= "You hear the water splashing around you.";
    private static final String TXT_GRASS	= "The smell of vegetation is thick in the air.";
    private static final String TXT_SECRETS	= "The atmosphere hints that this floor hides many secrets.";

    static GameScene scene;

    private SkinnedBlock water;
    private DungeonTilemap tiles;
//    private FogOfWar fog;
//    private HeroSprite hero;
//
//    private GameLog log;
//
//    private BusyIndicator busy;
//
//    private static CellSelector cellSelector;

    private Group terrain;
    private Group ripples;
    private Group plants;
    private Group heaps;
    private Group mobs;
    private Group emitters;
    private Group effects;
    private Group gases;
    private Group spells;
    private Group statuses;
    private Group emoicons;

//    private Toolbar toolbar;
    private Toast prompt;

    @Override
    public void create() {
        Music.INSTANCE.play( Assets.TUNE, true );
        Music.INSTANCE.volume( 1f );

//        PedometerPixelDungeon.lastClass( Dungeon.hero.heroClass.ordinal() );

        super.create();
        Camera.main.zoom( defaultZoom + PedometerPixelDungeon.zoom() );

        scene = this;

        terrain = new Group();
        add( terrain );

        Log.i(TAG, "GameScene 실행");
//        water = new SkinnedBlock(
//                Level.WIDTH * DungeonTilemap.SIZE,
//                Level.HEIGHT * DungeonTilemap.SIZE,
//                Dungeon.level.waterTex() );
//        terrain.add( water );
//
//        ripples = new Group();
//        terrain.add( ripples );
//
//        tiles = new DungeonTilemap();
//        terrain.add( tiles );
//
//        Dungeon.level.addVisuals( this );
//
//        plants = new Group();
//        add( plants );
//
//        int size = Dungeon.level.plants.size();
//        for (int i=0; i < size; i++) {
//            addPlantSprite( Dungeon.level.plants.valueAt( i ) );
//        }
//
//        heaps = new Group();
//        add( heaps );
//
//        size = Dungeon.level.heaps.size();
//        for (int i=0; i < size; i++) {
//            addHeapSprite( Dungeon.level.heaps.valueAt( i ) );
//        }
//
//        emitters = new Group();
//        effects = new Group();
//        emoicons = new Group();
//
//        mobs = new Group();
//        add( mobs );
//
//        for (Mob mob : Dungeon.level.mobs) {
//            addMobSprite( mob );
//            if (Statistics.amuletObtained) {
//                mob.beckon( Dungeon.hero.pos );
//            }
//        }
//
//        add( emitters );
//        add( effects );
//
//        gases = new Group();
//        add( gases );

//        for (Blob blob : Dungeon.level.blobs.values()) {
//            blob.emitter = null;
//            addBlobSprite( blob );
//        }
//
//        fog = new FogOfWar( Level.WIDTH, Level.HEIGHT );
//        fog.updateVisibility( Dungeon.visible, Dungeon.level.visited, Dungeon.level.mapped );
//        add( fog );
//
//        brightness( PixelDungeon.brightness() );

//        spells = new Group();
//        add( spells );
//
//        statuses = new Group();
//        add( statuses );
//
//        add( emoicons );

//        hero = new HeroSprite();
//        hero.place( Dungeon.hero.pos );
//        hero.updateArmor();
//        mobs.add( hero );
//
//        add( new HealthIndicator() );
//
//        add( cellSelector = new CellSelector( tiles ) );
//
//        StatusPane sb = new StatusPane();
//        sb.camera = uiCamera;
//        sb.setSize( uiCamera.width, 0 );
//        add( sb );
//
//        toolbar = new Toolbar();
//        toolbar.camera = uiCamera;
//        toolbar.setRect( 0,uiCamera.height - toolbar.height(), uiCamera.width, toolbar.height() );
//        add( toolbar );
//
//        AttackIndicator attack = new AttackIndicator();
//        attack.camera = uiCamera;
//        attack.setPos(
//                uiCamera.width - attack.width(),
//                toolbar.top() - attack.height() );
//        add( attack );
//
//        log = new GameLog();
//        log.camera = uiCamera;
//        log.setRect( 0, toolbar.top(), attack.left(),  0 );
//        add( log );
//
//        busy = new BusyIndicator();
//        busy.camera = uiCamera;
//        busy.x = 1;
//        busy.y = sb.bottom() + 1;
//        add( busy );
//
//        switch (InterlevelScene.mode) {
//            case RESURRECT:
//                WandOfBlink.appear( Dungeon.hero, Dungeon.level.entrance );
//                new Flare( 8, 32 ).color( 0xFFFF66, true ).show( hero, 2f ) ;
//                break;
//            case RETURN:
//                WandOfBlink.appear(  Dungeon.hero, Dungeon.hero.pos );
//                break;
//            case FALL:
//                Chasm.heroLand();
//                break;
//            case DESCEND:
//                switch (Dungeon.depth) {
//                    case 1:
//                        WndStory.showChapter( WndStory.ID_SEWERS );
//                        break;
//                    case 6:
//                        WndStory.showChapter( WndStory.ID_PRISON );
//                        break;
//                    case 11:
//                        WndStory.showChapter( WndStory.ID_CAVES );
//                        break;
//                    case 16:
//                        WndStory.showChapter( WndStory.ID_METROPOLIS );
//                        break;
//                    case 22:
//                        WndStory.showChapter( WndStory.ID_HALLS );
//                        break;
//                }
//                if (Dungeon.hero.isAlive() && Dungeon.depth != 22) {
//                    Badges.validateNoKilling();
//                }
//                break;
//            default:
//        }
//
//        ArrayList<Item> dropped = Dungeon.droppedItems.get( Dungeon.depth );
//        if (dropped != null) {
//            for (Item item : dropped) {
//                int pos = Dungeon.level.randomRespawnCell();
//                if (item instanceof Potion) {
//                    ((Potion)item).shatter( pos );
//                } else if (item instanceof Plant.Seed) {
//                    Dungeon.level.plant( (Plant.Seed)item, pos );
//                } else {
//                    Dungeon.level.drop( item, pos );
//                }
//            }
//            Dungeon.droppedItems.remove( Dungeon.depth );
//        }
//
//        Camera.main.target = hero;
//
//        if (InterlevelScene.mode != InterlevelScene.Mode.NONE) {
//            if (Dungeon.depth < Statistics.deepestFloor) {
//                GLog.h( TXT_WELCOME_BACK, Dungeon.depth );
//            } else {
//                GLog.h( TXT_WELCOME, Dungeon.depth );
//                Sample.INSTANCE.play( Assets.SND_DESCEND );
//            }
//            switch (Dungeon.level.feeling) {
//                case CHASM:
//                    GLog.w( TXT_CHASM );
//                    break;
//                case WATER:
//                    GLog.w( TXT_WATER );
//                    break;
//                case GRASS:
//                    GLog.w( TXT_GRASS );
//                    break;
//                default:
//            }
//            if (Dungeon.level instanceof RegularLevel &&
//                    ((RegularLevel) Dungeon.level).secretDoors > Random.IntRange( 3, 4 )) {
//                GLog.w( TXT_SECRETS );
//            }
//            if (Dungeon.nightMode && !Dungeon.bossLevel()) {
//                GLog.w( TXT_NIGHT_MODE );
//            }
//
//            InterlevelScene.mode = InterlevelScene.Mode.NONE;
//
//            fadeIn();
//        }
    }

//    public void destroy() {
//
//        scene = null;
//        Badges.saveGlobal();
//
//        super.destroy();
//    }
//
//    @Override
//    public synchronized void pause() {
//        try {
//            Dungeon.saveAll();
//            Badges.saveGlobal();
//        } catch (IOException e) {
//            //
//        }
//    }
//
//    @Override
//    public synchronized void update() {
//        if (Dungeon.hero == null) {
//            return;
//        }
//
//        super.update();
//
//        water.offset( 0, -5 * Game.elapsed );
//
//        Actor.process();
//
//        if (Dungeon.hero.ready && !Dungeon.hero.paralysed) {
//            log.newLine();
//        }
//
//        cellSelector.enabled = Dungeon.hero.ready;
//    }
//
//    @Override
//    protected void onBackPressed() {
//        if (!cancel()) {
//            add( new WndGame() );
//        }
//    }
//
//    @Override
//    protected void onMenuPressed() {
//        if (Dungeon.hero.ready) {
//            selectItem( null, WndBag.Mode.ALL, null );
//        }
//    }
//
//    public void brightness( boolean value ) {
//        water.rm = water.gm = water.bm =
//                tiles.rm = tiles.gm = tiles.bm =
//                        value ? 1.5f : 1.0f;
//        if (value) {
//            fog.am = +2f;
//            fog.aa = -1f;
//        } else {
//            fog.am = +1f;
//            fog.aa =  0f;
//        }
//    }
//
//    private void addHeapSprite( Heap heap ) {
//        ItemSprite sprite = heap.sprite = (ItemSprite)heaps.recycle( ItemSprite.class );
//        sprite.revive();
//        sprite.link( heap );
//        heaps.add( sprite );
//    }
//
//    private void addDiscardedSprite( Heap heap ) {
//        heap.sprite = (DiscardedItemSprite)heaps.recycle( DiscardedItemSprite.class );
//        heap.sprite.revive();
//        heap.sprite.link( heap );
//        heaps.add( heap.sprite );
//    }
//
//    private void addPlantSprite( Plant plant ) {
//        (plant.sprite = (PlantSprite)plants.recycle( PlantSprite.class )).reset( plant );
//    }
//
//    private void addBlobSprite( final Blob gas ) {
//        if (gas.emitter == null) {
//            gases.add( new BlobEmitter( gas ) );
//        }
//    }

//    private void addMobSprite( Mob mob ) {
//        CharSprite sprite = mob.sprite();
//        sprite.visible = Dungeon.visible[mob.pos];
//        mobs.add( sprite );
//        sprite.link( mob );
//    }

//    private void prompt( String text ) {
//
//        if (prompt != null) {
//            prompt.killAndErase();
//            prompt = null;
//        }
//
//        if (text != null) {
//            prompt = new Toast( text ) {
//                @Override
//                protected void onClose() {
//                    cancel();
//                }
//            };
//            prompt.camera = uiCamera;
//            prompt.setPos( (uiCamera.width - prompt.width()) / 2, uiCamera.height - 60 );
//            add( prompt );
//        }
//    }

//    private void showBanner( Banner banner ) {
//        banner.camera = uiCamera;
//        banner.x = align( uiCamera, (uiCamera.width - banner.width) / 2 );
//        banner.y = align( uiCamera, (uiCamera.height - banner.height) / 3 );
//        add( banner );
//    }

    // -------------------------------------------------------

//    public static void add( Plant plant ) {
//        if (scene != null) {
//            scene.addPlantSprite( plant );
//        }
//    }

//    public static void add( Blob gas ) {
//        Actor.add( gas );
//        if (scene != null) {
//            scene.addBlobSprite( gas );
//        }
//    }

//    public static void add( Heap heap ) {
//        if (scene != null) {
//            scene.addHeapSprite( heap );
//        }
//    }

//    public static void discard( Heap heap ) {
//        if (scene != null) {
//            scene.addDiscardedSprite( heap );
//        }
//    }

//    public static void add( Mob mob ) {
//        Dungeon.level.mobs.add( mob );
//        Actor.add( mob );
//        Actor.occupyCell( mob );
//        scene.addMobSprite( mob );
//    }

//    public static void add( Mob mob, float delay ) {
//        Dungeon.level.mobs.add( mob );
//        Actor.addDelayed( mob, delay );
//        Actor.occupyCell( mob );
//        scene.addMobSprite( mob );
//    }

//    public static void add( EmoIcon icon ) {
//        scene.emoicons.add( icon );
//    }

//    public static void effect( Visual effect ) {
//        scene.effects.add( effect );
//    }

//    public static Ripple ripple( int pos ) {
//        Ripple ripple = (Ripple)scene.ripples.recycle( Ripple.class );
//        ripple.reset( pos );
//        return ripple;
//    }

//    public static SpellSprite spellSprite() {
//        return (SpellSprite)scene.spells.recycle( SpellSprite.class );
//    }

//    public static Emitter emitter() {
//        if (scene != null) {
//            Emitter emitter = (Emitter)scene.emitters.recycle( Emitter.class );
//            emitter.revive();
//            return emitter;
//        } else {
//            return null;
//        }
//    }

//    public static FloatingText status() {
//        return scene != null ? (FloatingText)scene.statuses.recycle( FloatingText.class ) : null;
//    }

//    public static void pickUp( Item item ) {
//        scene.toolbar.pickup( item );
//    }

//    public static void updateMap() {
//        if (scene != null) {
////            scene.tiles.updated.set( 0, 0, Level.WIDTH, Level.HEIGHT );
//        }
//    }

//    public static void updateMap( int cell ) {
//        if (scene != null) {
////            scene.tiles.updated.union( cell % Level.WIDTH, cell / Level.WIDTH );
//        }
//    }

//    public static void discoverTile( int pos, int oldValue ) {
//        if (scene != null) {
////            scene.tiles.discover( pos, oldValue );
//        }
//    }

//    public static void show( Window wnd ) {
////        cancelCellSelector();
////        scene.add( wnd );
//    }

    public static void afterObserve() {
        if (scene != null) {
//            scene.fog.updateVisibility( Dungeon.visible, Dungeon.level.visited, Dungeon.level.mapped );

            for (Mob mob : Dungeon.level.mobs) {
                mob.sprite.visible = Dungeon.visible[mob.pos];
            }
        }
    }

//    public static void flash( int color ) {
//        scene.fadeIn( 0xFF000000 | color, true );
//    }

//    public static void gameOver() {
//        Banner gameOver = new Banner( BannerSprites.get( BannerSprites.Type.GAME_OVER ) );
//        gameOver.show( 0x000000, 1f );
//        scene.showBanner( gameOver );
//
//        Sample.INSTANCE.play( Assets.SND_DEATH );
//    }

//    public static void bossSlain() {
//        if (Dungeon.hero.isAlive()) {
//            Banner bossSlain = new Banner( BannerSprites.get( BannerSprites.Type.BOSS_SLAIN ) );
//            bossSlain.show( 0xFFFFFF, 0.3f, 5f );
//            scene.showBanner( bossSlain );
//
//            Sample.INSTANCE.play( Assets.SND_BOSS );
//        }
//    }

//    public static void handleCell( int cell ) {
//        cellSelector.select( cell );
//    }

//    public static void selectCell( CellSelector.Listener listener ) {
//        cellSelector.listener = listener;
//        scene.prompt( listener.prompt() );
//    }

//    private static boolean cancelCellSelector() {
//        if (cellSelector.listener != null && cellSelector.listener != defaultCellListener) {
//            cellSelector.cancel();
//            return true;
//        } else {
//            return false;
//        }
//    }

//    public static WndBag selectItem( WndBag.Listener listener, WndBag.Mode mode, String title ) {
//        cancelCellSelector();
//
//        WndBag wnd = mode == Mode.SEED ?
//                WndBag.seedPouch( listener, mode, title ) :
//                WndBag.lastBag( listener, mode, title );
//        scene.add( wnd );
//
//        return wnd;
//    }

//    static boolean cancel() {
//        if (Dungeon.hero.curAction != null || Dungeon.hero.restoreHealth) {
//
//            Dungeon.hero.curAction = null;
//            Dungeon.hero.restoreHealth = false;
//            return true;
//
//        } else {
//
//            return cancelCellSelector();
//
//        }
//    }

//    public static void ready() {
//        selectCell( defaultCellListener );
//        QuickSlot.cancel();
//    }

//    private static final CellSelector.Listener defaultCellListener = new CellSelector.Listener() {
//        @Override
//        public void onSelect( Integer cell ) {
//            if (Dungeon.hero.handle( cell )) {
//                Dungeon.hero.next();
//            }
//        }
//        @Override
//        public String prompt() {
//            return null;
//        }
//    };
}
