//package com.example.pedometerpixeldungeon.mainsrc.items;
//
//import com.example.pedometerpixeldungeon.utils.Random;
//
//import java.util.HashMap;
//
//public class Generator {
//
//    public static enum Category {
//        MISC	( 5,	Item.class );
//
//        public Class<?>[] classes;
//        public float[] probs;
//
//        public float prob;
//        public Class<? extends Item> superClass;
//
//        private Category( float prob, Class<? extends Item> superClass ) {
//            this.prob = prob;
//            this.superClass = superClass;
//        }
//
//        public static int order( Item item ) {
//            for (int i=0; i < values().length; i++) {
//                if (values()[i].superClass.isInstance( item )) {
//                    return i;
//                }
//            }
//
////            return item instanceof Bag ? Integer.MAX_VALUE : Integer.MAX_VALUE - 1;
//            return 1; // ddd
//        }
//    };
//
//    private static HashMap<Category,Float> categoryProbs = new HashMap<Generator.Category, Float>();
//
//    static {
//
////        Category.GOLD.classes = new Class<?>[]{
////                Gold.class };
////        Category.GOLD.probs = new float[]{ 1 };
////
////        Category.SCROLL.classes = new Class<?>[]{
////                ScrollOfIdentify.class,
////                ScrollOfTeleportation.class,
////                ScrollOfRemoveCurse.class,
////                ScrollOfRecharging.class,
////                ScrollOfMagicMapping.class,
////                ScrollOfChallenge.class,
////                ScrollOfTerror.class,
////                ScrollOfLullaby.class,
////                ScrollOfPsionicBlast.class,
////                ScrollOfMirrorImage.class,
////                ScrollOfUpgrade.class,
////                ScrollOfEnchantment.class };
////        Category.SCROLL.probs = new float[]{ 30, 10, 15, 10, 15, 12, 8, 8, 4, 6, 0, 1 };
////
////        Category.POTION.classes = new Class<?>[]{
////                PotionOfHealing.class,
////                PotionOfExperience.class,
////                PotionOfToxicGas.class,
////                PotionOfParalyticGas.class,
////                PotionOfLiquidFlame.class,
////                PotionOfLevitation.class,
////                PotionOfStrength.class,
////                PotionOfMindVision.class,
////                PotionOfPurity.class,
////                PotionOfInvisibility.class,
////                PotionOfMight.class,
////                PotionOfFrost.class };
////        Category.POTION.probs = new float[]{ 45, 4, 15, 10, 15, 10, 0, 20, 12, 10, 0, 10 };
////
////        Category.WAND.classes = new Class<?>[]{
////                WandOfTeleportation.class,
////                WandOfSlowness.class,
////                WandOfFirebolt.class,
////                WandOfRegrowth.class,
////                WandOfPoison.class,
////                WandOfBlink.class,
////                WandOfLightning.class,
////                WandOfAmok.class,
////                WandOfReach.class,
////                WandOfFlock.class,
////                WandOfMagicMissile.class,
////                WandOfDisintegration.class,
////                WandOfAvalanche.class };
////        Category.WAND.probs = new float[]{ 10, 10, 15, 6, 10, 11, 15, 10, 6, 10, 0, 5, 5 };
////
////        Category.WEAPON.classes = new Class<?>[]{
////                Dagger.class,
////                Knuckles.class,
////                Quarterstaff.class,
////                Spear.class,
////                Mace.class,
////                Sword.class,
////                Longsword.class,
////                BattleAxe.class,
////                WarHammer.class,
////                Glaive.class,
////                ShortSword.class,
////                Dart.class,
////                Javelin.class,
////                IncendiaryDart.class,
////                CurareDart.class,
////                Shuriken.class,
////                Boomerang.class,
////                Tamahawk.class };
////        Category.WEAPON.probs = new float[]{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1 };
////
////        Category.ARMOR.classes = new Class<?>[]{
////                ClothArmor.class,
////                LeatherArmor.class,
////                MailArmor.class,
////                ScaleArmor.class,
////                PlateArmor.class };
////        Category.ARMOR.probs = new float[]{ 1, 1, 1, 1, 1 };
////
////        Category.FOOD.classes = new Class<?>[]{
////                Food.class,
////                Pasty.class,
////                MysteryMeat.class };
////        Category.FOOD.probs = new float[]{ 4, 1, 0 };
////
////        Category.RING.classes = new Class<?>[]{
////                RingOfMending.class,
////                RingOfDetection.class,
////                RingOfShadows.class,
////                RingOfPower.class,
////                RingOfHerbalism.class,
////                RingOfAccuracy.class,
////                RingOfEvasion.class,
////                RingOfSatiety.class,
////                RingOfHaste.class,
////                RingOfElements.class,
////                RingOfHaggler.class,
////                RingOfThorns.class };
////        Category.RING.probs = new float[]{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 };
////
////        Category.SEED.classes = new Class<?>[]{
////                Firebloom.Seed.class,
////                Icecap.Seed.class,
////                Sorrowmoss.Seed.class,
////                Dreamweed.Seed.class,
////                Sungrass.Seed.class,
////                Earthroot.Seed.class,
////                Fadeleaf.Seed.class,
////                Rotberry.Seed.class };
////        Category.SEED.probs = new float[]{ 1, 1, 1, 1, 1, 1, 1, 0 };
////
////        Category.MISC.classes = new Class<?>[]{
////                Bomb.class,
////                Honeypot.class};
////        Category.MISC.probs = new float[]{ 2, 1 };
//    }
//
//    public static void reset() {
//        for (Category cat : Category.values()) {
//            categoryProbs.put( cat, cat.prob );
//        }
//    }
//
//    public static Item random() {
//        return random( Random.chances( categoryProbs ) );
//    }
//
//    public static Item random( Category cat ) {
//        try {
//
//            categoryProbs.put( cat, categoryProbs.get( cat ) / 2 );
//
//            switch (cat) {
////                case ARMOR:
////                    return randomArmor();
////                case WEAPON:
////                    return randomWeapon();
//                default:
//                    return ((Item)cat.classes[Random.chances( cat.probs )].newInstance()).random();
//            }
//
//        } catch (Exception e) {
//
//            return null;
//
//        }
//    }
//
//    public static Item random( Class<? extends Item> cl ) {
//        try {
//
//            return ((Item)cl.newInstance()).random();
//
//        } catch (Exception e) {
//
//            return null;
//
//        }
//    }
//
////    public static Armor randomArmor() throws Exception {
////
////        int curStr = Hero.STARTING_STR + Dungeon.potionOfStrength;
////
////        Category cat = Category.ARMOR;
////
////        Armor a1 = (Armor)cat.classes[Random.chances( cat.probs )].newInstance();
////        Armor a2 = (Armor)cat.classes[Random.chances( cat.probs )].newInstance();
////
////        a1.random();
////        a2.random();
////
////        return Math.abs( curStr - a1.STR ) < Math.abs( curStr - a2.STR ) ? a1 : a2;
////    }
//
////    public static Weapon randomWeapon() throws Exception {
////
////        int curStr = Hero.STARTING_STR + Dungeon.potionOfStrength;
////
////        Category cat = Category.WEAPON;
////
////        Weapon w1 = (Weapon)cat.classes[Random.chances( cat.probs )].newInstance();
////        Weapon w2 = (Weapon)cat.classes[Random.chances( cat.probs )].newInstance();
////
////        w1.random();
////        w2.random();
////
////        return Math.abs( curStr - w1.STR ) < Math.abs( curStr - w2.STR ) ? w1 : w2;
////    }
//}