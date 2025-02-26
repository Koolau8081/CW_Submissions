public int[] rotateLeft3(int[] nums) {
  int rLeftZero = nums[0];
  nums[0] = nums[1];
  nums[1] = nums[2];
  nums[2] = rLeftZero;

  return nums;
}
 
public int[] reverse3(int[] nums) {
  int revs = nums[0];
  nums[0] = nums[2];
  nums[2] = revs;
  return nums;
}

public int[] maxEnd3(int[] nums) {
 
  int holder = 0;
  
  if(nums[0] >= nums[2]){
    nums[1] = nums[0];
    nums[2] = nums[0];
  }
  if(nums[2] > nums[0]){
    nums[0] = nums[2];
    nums[1] = nums[2];
  }
  
  return nums;
}

public int sum2(int[] nums) {
  int sum = 0;
  if(nums.length > 1){
    sum = nums[0] + nums[1];
  }
  if( nums.length == 1){
    sum = nums[0];
  }
  if(nums.length == 0){
    sum = 0;
  }
  
  return sum;
}




