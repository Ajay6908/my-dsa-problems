class Solution {
    public String frequencySort(String s) {
        char[] c=s.toCharArray();
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char t:c)
        {
            map.put(t,map.getOrDefault(t,0)+1);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<Character,Integer>> com=new Comparator<Map.Entry<Character,Integer>>()
        {
            @Override
            public int compare(Map.Entry<Character,Integer> e1,Map.Entry<Character,Integer> e2)
            {
                int cmp=e1.getValue().compareTo(e2.getValue());
                if(cmp==1)
                return -1;
                if(cmp==-1)
                return 1;
                return 0;
            }
        };
        Collections.sort(list,com);
        String str="";
        for(Map.Entry<Character,Integer> e:list)
        {
            int p=e.getValue();
            while(p>0)
            {
            str=str+e.getKey().toString();
            p--;
            }
        }
        return str;
       


       

        
    }
}