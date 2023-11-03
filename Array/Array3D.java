//Wap to create 3d matrix
class Array3D
{
    public static void main(String[]args)
    {
        int arr[3][3][3];
        int i,j,k;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                    arr[i][j][k]=i+j+k;
                }
            }
        }
    }
}