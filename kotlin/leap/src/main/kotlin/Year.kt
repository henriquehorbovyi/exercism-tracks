class Year(value: Int){
    var isLeap = (value % 4 == 0) && (value % 100 != 0) || ((value % 100 == 0) && (value % 400 == 0))
}