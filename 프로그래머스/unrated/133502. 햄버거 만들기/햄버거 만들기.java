class Solution {
    public static int solution(int[] ingredient) {
        return packed_Burger(ingredient);
    }

    private static int packed_Burger(int[] ingredient) {
        StringBuilder ingredients = new StringBuilder();
        int count = 0;
        for(int num=0; num < ingredient.length; num++) {
            ingredients.append(ingredient[num]);
            if (ingredient[num] == 1 && ingredients.length() > 3) {
                if (make_Burger(ingredients)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean make_Burger(StringBuilder ingredients) {
        if(ingredients.length()>3 && ingredients.subSequence(
                                        ingredients.length()-4,
                                        ingredients.length()).equals("1231")) {
            ingredients.delete(ingredients.length()-4, ingredients.length());
            return true;
        }
        return false;
    }
}