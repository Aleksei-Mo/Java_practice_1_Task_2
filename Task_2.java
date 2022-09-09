/**
 * Напишите функцию, для поиска наиболее длинного общего префикса, среди массива
 * строк.
 * Если общего префикса нет, то возвращать пустую строку. Пример ["aabb",
 * "aabbb", "aaabb"] - ответ "aa"
 */
public class Task_2 {
    public static void main(String[] args) {
        String[] strArray = { "aaab", "aaabbb", "aaabb" };
        int strLen = strArray.length;
        String result = "";
        String strTemp_1 = strArray[0];
        String strTemp_2 = strArray[1];
        // System.out.println(strArray[0] );
        if ((strTemp_1.charAt(0) != strTemp_2.charAt(0))|| (strLen==0)) {
            System.out.println("strTemp_1=" + strTemp_1);
            System.out.println("strTemp_2=" + strTemp_2);
            System.out.println("Result=решения нет" + result);
        } else {
            result=strArray[0];
            for (int i = 1; i < strLen; i++) {
                while (strArray[i].indexOf(result)!=0){
                    result=result.substring(0, result.length()-1);
                }
                          }
            System.out.println("Result=" + result); 
        }
    }
}
