class Solution
{
    
    void help(String s, int index, List <String> a, StringBuilder temp){
        if(index==s.length()){
            if(temp.length()!=0)a.add(temp.toString());
            return;
        }
        
        help(s, index+1,a,temp);
        temp.append(s.charAt(index));
        help(s,index+1,a,temp);
        temp.deleteCharAt(temp.length()-1);
    }
    public List<String> AllPossibleStrings(String s)
    {
        List<String> a = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        help(s,0,a,temp);
        Collections.sort(a);
        return a;
    }
}