class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counter = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for(String s : cpdomains) {
            String[] split = s.split(" ");
            
            counter.put(split[1], counter.getOrDefault(split[1], 0) + Integer.parseInt(split[0]));
            int decimalIndex = split[1].indexOf(".");
            
            while(decimalIndex != -1) {
                split[1] = split[1].substring(decimalIndex + 1);
                counter.put(split[1], counter.getOrDefault(split[1], 0) + Integer.parseInt(split[0]));
                decimalIndex = split[1].indexOf(".");
            }
        }
        
        for(Map.Entry<String, Integer> entry : counter.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getValue()).append(" ").append(entry.getKey());
            result.add(sb.toString());
        }
        
        return result;
    }
}