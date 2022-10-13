class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri=new ArrayList<>();
        for(int i=0;i<numRows;i++){
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
        return tri;
    }
}

// Question Link: https://leetcode.com/problems/pascals-triangle/
