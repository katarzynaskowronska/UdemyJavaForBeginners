package pl.katarzynaskowronska.learning.interfaces;

public class DocumentTest {
    public static void main(String[] args) {
        TxtDocument txt = new TxtDocument();
        DrawDocument draw = new DrawDocument();

        System.out.println(txt.open("txtPath"));
        System.out.println(draw.save());

        draw.write();

        Document calc = new Document() {
            @Override
            public boolean save() {
                return false;
            }

            @Override
            public String open(String path) {
                return null;
            }
        };
        //OnClickListener

//        draw.draw(new OnClickListener() {
//            @Override
//            public void onClick() {
//
//            }
//        });
        //-> to samo zamienione na lambda zeby nie pokazywalo calego interfejsu - stosowane kiedy w interf jes 1 metoda
        draw.draw(() -> {
            System.out.println("onClick");
        });

    }
}
