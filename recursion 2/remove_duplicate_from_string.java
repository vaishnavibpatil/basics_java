public class remove_duplicate_from_string 
{
    public static void Remove(String str,int idx,StringBuilder sb,boolean map[])
    {
        if(idx == str.length())
        {
           System.out.println(sb);
           return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar - 'a']== true)
        {
            Remove(str,idx+1,sb,map);
        }
        else
        {
            map[currchar - 'a'] = true;
            Remove(str,idx+1,sb.append(currchar),map);
        }
    }
    public static void main(String[] args)  
    {
        String str = "aabbccddee";
        Remove(str,0,new StringBuilder(""), new boolean[26]);
    }

    
}
