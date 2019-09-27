class SimpleArray
{
   public static int [] squareAll(int values[])
   {
      int [] newValues = new int[values.length];
      for (int i = 0; i < values.length; i++)
      {
         int oldVal = values[i];
         newValues[i] = oldVal * oldVal;
      }
      return newValues;
   }
}
