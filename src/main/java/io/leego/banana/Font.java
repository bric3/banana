package io.leego.banana;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Yihleego
 */
public enum Font implements FontSpec {
    ONE_ROW("1Row", "1Row.flf"),
    THREE_D("3-D", "3-D.flf"),
    THREE_D_ASCII("3D-ASCII", "3D-ASCII.flf"),
    THREE_D_DIAGONAL("3D Diagonal", "3D_Diagonal.flf"),
    THREE_FIVE("3x5", "3x5.flf"),
    FOUR_MAX("4Max", "4Max.flf"),
    FIVE_LINE_OBLIQUE("5 Line Oblique", "5_Line_Oblique.flf"),
    AMC_3_LINE("AMC 3 Line", "AMC_3_Line.flf"),
    AMC_3_LIV1("AMC 3 Liv1", "AMC_3_Liv1.flf"),
    AMC_AAA01("AMC AAA01", "AMC_AAA01.flf"),
    AMC_NEKO("AMC Neko", "AMC_Neko.flf"),
    AMC_RAZOR("AMC Razor", "AMC_Razor.flf"),
    AMC_RAZOR2("AMC Razor2", "AMC_Razor2.flf"),
    AMC_SLASH("AMC Slash", "AMC_Slash.flf"),
    AMC_SLIDER("AMC Slider", "AMC_Slider.flf"),
    AMC_THIN("AMC Thin", "AMC_Thin.flf"),
    AMC_TUBES("AMC Tubes", "AMC_Tubes.flf"),
    AMC_UNTITLED("AMC Untitled", "AMC_Untitled.flf"),
    ANSI_SHADOW("ANSI Shadow", "ANSI_Shadow.flf"),
    ASCII_NEW_ROMAN("ASCII New Roman", "ASCII_New_Roman.flf"),
    ACROBATIC("Acrobatic", "Acrobatic.flf"),
    ALLIGATOR("Alligator", "Alligator.flf"),
    ALLIGATOR2("Alligator2", "Alligator2.flf"),
    ALPHA("Alpha", "Alpha.flf"),
    ALPHABET("Alphabet", "Alphabet.flf"),
    ARROWS("Arrows", "Arrows.flf"),
    AVATAR("Avatar", "Avatar.flf"),
    BANNER("Banner", "Banner.flf"),
    BANNER3_D("Banner3-D", "Banner3-D.flf"),
    BANNER3("Banner3", "Banner3.flf"),
    BANNER4("Banner4", "Banner4.flf"),
    BARBWIRE("Barbwire", "Barbwire.flf"),
    BASIC("Basic", "Basic.flf"),
    BEAR("Bear", "Bear.flf"),
    BELL("Bell", "Bell.flf"),
    BENJAMIN("Benjamin", "Benjamin.flf"),
    BIG("Big", "Big.flf"),
    BIG_CHIEF("Big Chief", "Big_Chief.flf"),
    BIG_MONEY_NE("Big Money-ne", "Big_Money-ne.flf"),
    BIG_MONEY_NW("Big Money-nw", "Big_Money-nw.flf"),
    BIG_MONEY_SE("Big Money-se", "Big_Money-se.flf"),
    BIG_MONEY_SW("Big Money-sw", "Big_Money-sw.flf"),
    BIGFIG("Bigfig", "Bigfig.flf"),
    BINARY("Binary", "Binary.flf"),
    BLOCK("Block", "Block.flf"),
    BLOCKS("Blocks", "Blocks.flf"),
    BLOODY("Bloody", "Bloody.flf"),
    BOLGER("Bolger", "Bolger.flf"),
    BRACED("Braced", "Braced.flf"),
    BRIGHT("Bright", "Bright.flf"),
    BROADWAY("Broadway", "Broadway.flf"),
    BROADWAY_KB("Broadway KB", "Broadway_KB.flf"),
    BUBBLE("Bubble", "Bubble.flf"),
    BULBHEAD("Bulbhead", "Bulbhead.flf"),
    CALIGRAPHY("Caligraphy", "Caligraphy.flf"),
    CALIGRAPHY2("Caligraphy2", "Caligraphy2.flf"),
    CALVIN_S("Calvin S", "Calvin_S.flf"),
    CARDS("Cards", "Cards.flf"),
    CATWALK("Catwalk", "Catwalk.flf"),
    CHISELED("Chiseled", "Chiseled.flf"),
    CHUNKY("Chunky", "Chunky.flf"),
    COINSTAK("Coinstak", "Coinstak.flf"),
    COLA("Cola", "Cola.flf"),
    COLOSSAL("Colossal", "Colossal.flf"),
    COMPUTER("Computer", "Computer.flf"),
    CONTESSA("Contessa", "Contessa.flf"),
    CONTRAST("Contrast", "Contrast.flf"),
    COSMIKE("Cosmike", "Cosmike.flf"),
    CRAWFORD("Crawford", "Crawford.flf"),
    CRAWFORD2("Crawford2", "Crawford2.flf"),
    CRAZY("Crazy", "Crazy.flf"),
    CRICKET("Cricket", "Cricket.flf"),
    CURSIVE("Cursive", "Cursive.flf"),
    CYBERLARGE("Cyberlarge", "Cyberlarge.flf"),
    CYBERMEDIUM("Cybermedium", "Cybermedium.flf"),
    CYBERSMALL("Cybersmall", "Cybersmall.flf"),
    CYGNET("Cygnet", "Cygnet.flf"),
    DANC4("DANC4", "DANC4.flf"),
    DWHISTLED("DWhistled", "DWhistled.flf"),
    DANCING_FONT("Dancing Font", "Dancing_Font.flf"),
    DECIMAL("Decimal", "Decimal.flf"),
    DEF_LEPPARD("Def Leppard", "Def_Leppard.flf"),
    DELTA_CORPS_PRIEST_1("Delta Corps Priest 1", "Delta_Corps_Priest_1.flf"),
    DIAMOND("Diamond", "Diamond.flf"),
    DIET_COLA("Diet Cola", "Diet_Cola.flf"),
    DIGITAL("Digital", "Digital.flf"),
    DOH("Doh", "Doh.flf"),
    DOOM("Doom", "Doom.flf"),
    DOT_MATRIX("Dot Matrix", "Dot_Matrix.flf"),
    DOUBLE("Double", "Double.flf"),
    DOUBLE_SHORTS("Double Shorts", "Double_Shorts.flf"),
    DR_PEPPER("Dr Pepper", "Dr_Pepper.flf"),
    EFTI_CHESS("Efti Chess", "Efti_Chess.flf"),
    EFTI_FONT("Efti Font", "Efti_Font.flf"),
    EFTI_ITALIC("Efti Italic", "Efti_Italic.flf"),
    EFTI_PITI("Efti Piti", "Efti_Piti.flf"),
    EFTI_ROBOT("Efti Robot", "Efti_Robot.flf"),
    EFTI_WALL("Efti Wall", "Efti_Wall.flf"),
    EFTI_WATER("Efti Water", "Efti_Water.flf"),
    ELECTRONIC("Electronic", "Electronic.flf"),
    ELITE("Elite", "Elite.flf"),
    EPIC("Epic", "Epic.flf"),
    FENDER("Fender", "Fender.flf"),
    FILTER("Filter", "Filter.flf"),
    FIRE_FONT_K("Fire Font-k", "Fire_Font-k.flf"),
    FIRE_FONT_S("Fire Font-s", "Fire_Font-s.flf"),
    FLIPPED("Flipped", "Flipped.flf"),
    FLOWER_POWER("Flower Power", "Flower_Power.flf"),
    FOUR_TOPS("Four Tops", "Four_Tops.flf"),
    FRAKTUR("Fraktur", "Fraktur.flf"),
    FUN_FACE("Fun Face", "Fun_Face.flf"),
    FUN_FACES("Fun Faces", "Fun_Faces.flf"),
    FUZZY("Fuzzy", "Fuzzy.flf"),
    GEORGI16("Georgi16", "Georgi16.flf"),
    GEORGIA11("Georgia11", "Georgia11.flf"),
    GHOST("Ghost", "Ghost.flf"),
    GHOULISH("Ghoulish", "Ghoulish.flf"),
    GLENYN("Glenyn", "Glenyn.flf"),
    GOOFY("Goofy", "Goofy.flf"),
    GOTHIC("Gothic", "Gothic.flf"),
    GRACEFUL("Graceful", "Graceful.flf"),
    GRADIENT("Gradient", "Gradient.flf"),
    GRAFFITI("Graffiti", "Graffiti.flf"),
    GREEK("Greek", "Greek.flf"),
    HEART_LEFT("Heart Left", "Heart_Left.flf"),
    HEART_RIGHT("Heart Right", "Heart_Right.flf"),
    HENRY_3D("Henry 3D", "Henry_3D.flf"),
    HEX("Hex", "Hex.flf"),
    HIEROGLYPHS("Hieroglyphs", "Hieroglyphs.flf"),
    HOLLYWOOD("Hollywood", "Hollywood.flf"),
    HORIZONTAL_LEFT("Horizontal Left", "Horizontal_Left.flf"),
    HORIZONTAL_RIGHT("Horizontal Right", "Horizontal_Right.flf"),
    ICL_1900("ICL-1900", "ICL-1900.flf"),
    IMPOSSIBLE("Impossible", "Impossible.flf"),
    INVITA("Invita", "Invita.flf"),
    ISOMETRIC1("Isometric1", "Isometric1.flf"),
    ISOMETRIC2("Isometric2", "Isometric2.flf"),
    ISOMETRIC3("Isometric3", "Isometric3.flf"),
    ISOMETRIC4("Isometric4", "Isometric4.flf"),
    ITALIC("Italic", "Italic.flf"),
    IVRIT("Ivrit", "Ivrit.flf"),
    JS_BLOCK_LETTERS("JS Block Letters", "JS_Block_Letters.flf"),
    JS_BRACKET_LETTERS("JS Bracket Letters", "JS_Bracket_Letters.flf"),
    JS_CAPITAL_CURVES("JS Capital Curves", "JS_Capital_Curves.flf"),
    JS_CURSIVE("JS Cursive", "JS_Cursive.flf"),
    JS_STICK_LETTERS("JS Stick Letters", "JS_Stick_Letters.flf"),
    JACKY("Jacky", "Jacky.flf"),
    JAZMINE("Jazmine", "Jazmine.flf"),
    JERUSALEM("Jerusalem", "Jerusalem.flf"),
    KATAKANA("Katakana", "Katakana.flf"),
    KBAN("Kban", "Kban.flf"),
    KEYBOARD("Keyboard", "Keyboard.flf"),
    KNOB("Knob", "Knob.flf"),
    LCD("LCD", "LCD.flf"),
    LARRY_3D("Larry 3D", "Larry_3D.flf"),
    LEAN("Lean", "Lean.flf"),
    LETTERS("Letters", "Letters.flf"),
    LIL_DEVIL("Lil Devil", "Lil_Devil.flf"),
    LINE_BLOCKS("Line Blocks", "Line_Blocks.flf"),
    LINUX("Linux", "Linux.flf"),
    LOCKERGNOME("Lockergnome", "Lockergnome.flf"),
    MADRID("Madrid", "Madrid.flf"),
    MARQUEE("Marquee", "Marquee.flf"),
    MAXFOUR("Maxfour", "Maxfour.flf"),
    MERLIN1("Merlin1", "Merlin1.flf"),
    MERLIN2("Merlin2", "Merlin2.flf"),
    MIKE("Mike", "Mike.flf"),
    MINI("Mini", "Mini.flf"),
    MIRROR("Mirror", "Mirror.flf"),
    MNEMONIC("Mnemonic", "Mnemonic.flf"),
    MODULAR("Modular", "Modular.flf"),
    MORSE("Morse", "Morse.flf"),
    MOSCOW("Moscow", "Moscow.flf"),
    MSHEBREW210("Mshebrew210", "Mshebrew210.flf"),
    MUZZLE("Muzzle", "Muzzle.flf"),
    NSCRIPT("NScript", "NScript.flf"),
    NT_GREEK("NT Greek", "NT_Greek.flf"),
    NV_SCRIPT("NV Script", "NV_Script.flf"),
    NANCYJ_FANCY("Nancyj-Fancy", "Nancyj-Fancy.flf"),
    NANCYJ_UNDERLINED("Nancyj-Underlined", "Nancyj-Underlined.flf"),
    NANCYJ("Nancyj", "Nancyj.flf"),
    NIPPLES("Nipples", "Nipples.flf"),
    O8("O8", "O8.flf"),
    OS2("OS2", "OS2.flf"),
    OCTAL("Octal", "Octal.flf"),
    OGRE("Ogre", "Ogre.flf"),
    OLD_BANNER("Old Banner", "Old_Banner.flf"),
    PATORJK_HEX("Patorjk-HeX", "Patorjk-HeX.flf"),
    PATORJK_CHEESE("Patorjk Cheese", "Patorjk_Cheese.flf"),
    PAWP("Pawp", "Pawp.flf"),
    PEAKS("Peaks", "Peaks.flf"),
    PEAKS_SLANT("Peaks Slant", "Peaks_Slant.flf"),
    PEBBLES("Pebbles", "Pebbles.flf"),
    PEPPER("Pepper", "Pepper.flf"),
    POISON("Poison", "Poison.flf"),
    PUFFY("Puffy", "Puffy.flf"),
    PUZZLE("Puzzle", "Puzzle.flf"),
    PYRAMID("Pyramid", "Pyramid.flf"),
    RAMMSTEIN("Rammstein", "Rammstein.flf"),
    RECTANGLES("Rectangles", "Rectangles.flf"),
    RELIEF("Relief", "Relief.flf"),
    RELIEF2("Relief2", "Relief2.flf"),
    REVERSE("Reverse", "Reverse.flf"),
    ROMAN("Roman", "Roman.flf"),
    ROTATED("Rotated", "Rotated.flf"),
    ROUNDED("Rounded", "Rounded.flf"),
    ROWAN_CAP("Rowan Cap", "Rowan_Cap.flf"),
    ROZZO("Rozzo", "Rozzo.flf"),
    RUNIC("Runic", "Runic.flf"),
    RUNYC("Runyc", "Runyc.flf"),
    SL_SCRIPT("SL Script", "SL_Script.flf"),
    S_BLOOD("S Blood", "S_Blood.flf"),
    SANTA_CLARA("Santa Clara", "Santa_Clara.flf"),
    SCRIPT("Script", "Script.flf"),
    SERIFCAP("Serifcap", "Serifcap.flf"),
    SHADOW("Shadow", "Shadow.flf"),
    SHIMROD("Shimrod", "Shimrod.flf"),
    SHORT("Short", "Short.flf"),
    SLANT("Slant", "Slant.flf"),
    SLANT_RELIEF("Slant Relief", "Slant_Relief.flf"),
    SLIDE("Slide", "Slide.flf"),
    SMALL("Small", "Small.flf"),
    SMALL_CAPS("Small Caps", "Small_Caps.flf"),
    SMALL_ISOMETRIC1("Small Isometric1", "Small_Isometric1.flf"),
    SMALL_KEYBOARD("Small Keyboard", "Small_Keyboard.flf"),
    SMALL_POISON("Small Poison", "Small_Poison.flf"),
    SMALL_SCRIPT("Small Script", "Small_Script.flf"),
    SMALL_SHADOW("Small Shadow", "Small_Shadow.flf"),
    SMALL_SLANT("Small Slant", "Small_Slant.flf"),
    SMALL_TENGWAR("Small Tengwar", "Small_Tengwar.flf"),
    SOFT("Soft", "Soft.flf"),
    SPEED("Speed", "Speed.flf"),
    SPLIFF("Spliff", "Spliff.flf"),
    STACEY("Stacey", "Stacey.flf"),
    STAMPATE("Stampate", "Stampate.flf"),
    STAMPATELLO("Stampatello", "Stampatello.flf"),
    STANDARD("Standard", "Standard.flf"),
    STAR_STRIPS("Star Strips", "Star_Strips.flf"),
    STAR_WARS("Star Wars", "Star_Wars.flf"),
    STELLAR("Stellar", "Stellar.flf"),
    STFOREK("Stforek", "Stforek.flf"),
    STICK_LETTERS("Stick Letters", "Stick_Letters.flf"),
    STOP("Stop", "Stop.flf"),
    STRAIGHT("Straight", "Straight.flf"),
    STRONGER_THAN_ALL("Stronger Than All", "Stronger_Than_All.flf"),
    SUB_ZERO("Sub-Zero", "Sub-Zero.flf"),
    SWAMP_LAND("Swamp Land", "Swamp_Land.flf"),
    SWAN("Swan", "Swan.flf"),
    SWEET("Sweet", "Sweet.flf"),
    THIS("THIS", "THIS.flf"),
    TANJA("Tanja", "Tanja.flf"),
    TENGWAR("Tengwar", "Tengwar.flf"),
    TERM("Term", "Term.flf"),
    TEST1("Test1", "Test1.flf"),
    THE_EDGE("The Edge", "The_Edge.flf"),
    THICK("Thick", "Thick.flf"),
    THIN("Thin", "Thin.flf"),
    THORNED("Thorned", "Thorned.flf"),
    THREE_POINT("Three Point", "Three_Point.flf"),
    TICKS("Ticks", "Ticks.flf"),
    TICKS_SLANT("Ticks Slant", "Ticks_Slant.flf"),
    TILES("Tiles", "Tiles.flf"),
    TINKER_TOY("Tinker-Toy", "Tinker-Toy.flf"),
    TOMBSTONE("Tombstone", "Tombstone.flf"),
    TRAIN("Train", "Train.flf"),
    TREK("Trek", "Trek.flf"),
    TSALAGI("Tsalagi", "Tsalagi.flf"),
    TUBULAR("Tubular", "Tubular.flf"),
    TWISTED("Twisted", "Twisted.flf"),
    TWO_POINT("Two Point", "Two_Point.flf"),
    USA_FLAG("USA Flag", "USA_Flag.flf"),
    UNIVERS("Univers", "Univers.flf"),
    VARSITY("Varsity", "Varsity.flf"),
    WAVY("Wavy", "Wavy.flf"),
    WEIRD("Weird", "Weird.flf"),
    WET_LETTER("Wet Letter", "Wet_Letter.flf"),
    WHIMSY("Whimsy", "Whimsy.flf"),
    WOW("Wow", "Wow.flf"),


    CIRCLE("Circle", "circle.tlf"),
    EMBOSS("Emboss", "emboss.tlf"),
    EMBOSS2("Emboss 2", "emboss2.tlf"),
    FUTURE("Future", "future.tlf"),
    PAGGA("Pagga", "pagga.tlf"),
    RUSTO("Rusto", "rusto.tlf"),
    RUSTO_FAT("Rusto Fat", "rustofat.tlf"),

    ASCII9("ASCII 9", "ascii9.tlf"),
    ASCII12("ASCII 12", "ascii12.tlf"),
    BIG_ASCII9("Big ASCII 9", "bigascii9.tlf"),
    BIG_ASCII12("Big ASCII 12", "bigascii12.tlf"),
    SMALL_ASCII9("Small ASCII 9", "smascii9.tlf"),
    SMALL_ASCII12("Small ASCII 12", "smascii12.tlf"),
    ;

    public static final String ROOT_DIR_PATH = "banana";
    public static final String FONT_DIR_PATH = ROOT_DIR_PATH + "/fonts/";

    private final String name;
    private final String filename;

    Font(String name, String filename) {
        this.name = name;
        this.filename = filename;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFilename() {
        return FONT_DIR_PATH + filename;
    }

    @Override
    public Charset getCharset() {
        return StandardCharsets.UTF_8;
    }

    private static final Map<String, FontSpec> map = new HashMap<>(64);

    static {
        for (Font e : values()) {
            map.put(e.name, e);
        }
    }

    public static FontSpec get(String name) {
        return map.get(name);
    }

}
