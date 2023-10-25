class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            image[i] = reverseArr(image[i]);
            for(int j = 0; j < image[i].length; j++){
                if(image[i][j] == 1){
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }
    
    public int[] reverseArr(int[] innerImg){
        int length = innerImg.length - 1;
        int[] reversed = new int[innerImg.length];
        
        for(int i = 0; i < innerImg.length; i++){
            reversed[i] = innerImg[length];
            length--;
        }
        
        return reversed;
    }
}