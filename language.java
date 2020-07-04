/* Build an array or ArrayList of several language objects and loop through them to call getInfo().
Add new methods that allow users to set a specific region, change the number of speakers, or modify the word order.
Create several more language family classes that pertain to languages you’re interested in.
Map out the sign language families.
Add in further linguistic features (e.g., which genders are used, whether the language is tonal, etc.).
*/

public class Language {
   protected String name;
    protected integer numOfSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

  public Language(String langName, int speakers, String regions, String order) {
    this.name = langName;
    this.numOfSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = order;
  }

  public void getInfo() {
    System.out.println(name + " is spoken by " + numOfSpeakers + " people mainly in " + regionsSpoken + ". The language follows the word order: " + wordOrder);
  }

  public static void main (String[] args) {

    Language Ibo = new Language("Ibo", 50000000, "Abia, Enugu, Abakiliki, Anambra", "subject-verb-object");
    Ibo.getInfo();
    Mayan yucatec = new Mayan("Yucatec", 3000);
    yucatec.getInfo();
    SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 4000);
    SinoTibetan burmese = new SinoTibetan("Burmese", 7000);
  }
}
