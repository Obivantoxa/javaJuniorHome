package lesson17;

public class Main3 {
    public static void main(String[] args) {
        StringUtilsIpls utils = new StringUtilsIpls();
        System.out.println(utils.div("123", "2"));

        try {
            utils.findNumbers("sjdfjr3u9833`3/123,23,,./123`13,`523`5");
        } catch (CustomException e) {
            e.printStackTrace();


        }


    }
}
