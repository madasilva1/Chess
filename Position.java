public class Position {
   private int row;
   private int colum;

    Position(int row, int colum){
        this.colum = colum;
        this.row = row;
    }
    public void SetRowColum(int rw){
          row = rw;
    }
    public void SetColum(int cl) {
        colum = cl;
    }
    public int GetRow(){
        return  row;
    }
    public int GetColum(){

        return  colum;
    }



}
