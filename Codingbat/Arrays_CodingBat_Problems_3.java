public boolean has23(int[] nums) {
 boolean isTrue = false;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2 || nums[i] == 3){
      isTrue = true;
    }
    
  }
  return isTrue;
}

public boolean no23(int[] nums) {
   boolean isTrue = true;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2 || nums[i] == 3){
      isTrue = false;
    }
    
  }
  return isTrue;
}

public int[] makeLast(int[] nums) {
  int[] arr = new int[nums.length * 2];
  arr[arr.length -1] = nums[nums.length -1];
  
  return arr;
  
}

