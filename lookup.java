public static void lookup(ArrayList<String> books){
        System.out.println("请输入您要查阅的书籍：");
        Scanner sc = new Scanner(System.in);
        String bookname = sc.next();
        if(books.size()==0){
            System.out.println("书库中还没有书籍！");
        }else {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).equals(bookname)){
                    System.out.println("您要查阅的是书库的第"+i+1+"本书！");
                }else {
                    System.out.println("书库中没有找到您要查找的书籍！");
                }
            }
        }
    }