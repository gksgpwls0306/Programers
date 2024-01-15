import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList();
        
        if(cacheSize == 0)
            return cities.length * 5;
        
        for(int i = 0; i < cities.length; i++){
            cities[i] = cities[i].toUpperCase();
        }

        for(int i = 0; i < cities.length; i++){
            String city = cities[i];
            if(cache.contains(city)){
                answer++;
                cache.remove(cache.indexOf(city));
                cache.add(city);
            }else{
                answer += 5;
                if(cache.size() == cacheSize){
                    cache.remove(0);
                    cache.add(city);
                }else{
                    cache.add(city);
                }
            }
        }
        return answer;
    }
}