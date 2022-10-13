class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> tri=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
        List<Integer> list=new ArrayList<>();
            if(i==0){
                list.add(1);
            }else if(i==1){
                list.add(1);
                list.add(1);
            }else{
                list.add(tri.get(i-1).get(0));
                for(int j=0;j<tri.get(i-1).size()-1;j++){
                    list.add(tri.get(i-1).get(j)+tri.get(i-1).get(j+1));
                }
                list.add(tri.get(i-1).get(0));
            }
            tri.add(list);
        }
        return tri.get(tri.size()-1);
    }
}

// Question: https://leetcode.com/problems/pascals-triangle-ii/submissions/
