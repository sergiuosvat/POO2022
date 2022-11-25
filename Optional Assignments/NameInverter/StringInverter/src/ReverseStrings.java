
public class ReverseStrings {

    public String reverseAString(String name)
    {
        if(name == null)
            return null;
        if(name.isEmpty())
            return ("\"\"");
        name = name.trim();
        StringBuilder str  = new StringBuilder();
        String[] aux = name.split("[ ,.]+");
        if(aux.length == 1)
        {
            return aux[0];
        }
        str.append("\"");
        str.append(aux[aux.length-1]);
        str.append(", ");
        str.append(aux[aux.length-2]);
        str.append(" ");
        for(int i =0;i< aux.length-2;i++) {
            str.append(aux[i]);
            str.append(".");
            if(i!= aux.length-3)
                str.append(" ");
        }
        str.append("\"");
        return str.toString();
    }
}