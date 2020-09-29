import java.util.HashSet;
public class removeVowels {
    public String removVowels(String s){
        HashSet<Character> h=new HashSet<>();
        h.add('a');
        h.add('e');
        h.add('o');
        h.add('i');
        h.add('u');
        StringBuilder result = new StringBuilder();
        for(char c:s.toCharArray()){
            if(!h.contains(c))
            result.append(c);
        }
return result.toString();
    }
}
