public class StringsService {
    public String compare(String a, String b) {
        String result;
        if (a.equals(b)) {
            result = "������ ���������";
        } else {
            result = "������ �����������";
        }
        return result;
    }
}
