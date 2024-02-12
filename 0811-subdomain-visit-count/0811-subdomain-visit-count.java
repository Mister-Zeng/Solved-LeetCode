class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for(String s : cpdomains) {
            String[] split = s.split(" ");
            map.put(split[1], map.getOrDefault(split[1], 0) + Integer.parseInt(split[0]));
            int decimalIndex = split[1].indexOf('.');
            while(decimalIndex != -1) {
                split[1] = split[1].substring(decimalIndex + 1);
                map.put(split[1], map.getOrDefault(split[1], 0) + Integer.parseInt(split[0]));
                decimalIndex = split[1].indexOf('.');
            }
            
        }
        
        for(String s : map.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(map.get(s) + " " + s);
            result.add(sb.toString());
        }
        
        return result;
    }
}