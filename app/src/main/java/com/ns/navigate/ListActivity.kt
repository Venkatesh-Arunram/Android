package com.ns.navigate

object ListActivity
{
    val list:ArrayList<ImageList>
//    val spin:ArrayList<SpinList>
    init{
        list=ArrayList()
//    list.add(Images("Ali connors","Brunch this weekend?","Sure",R.drawable.ic_star))
//    list.add(Images("me,scott,jennifer","Summer bbq","aww yes",R.drawable.ic_star))
//    list.add(Images("Sandra Addams","Oui Oui","???????",R.drawable.ic_star))
//    list.add(Images("Trever Hanson","Order Confirmation","Thank You",R.drawable.ic_star))
//    list.add(Images("Britta Holt","Recipe to try","Eat this",R.drawable.ic_star))
//    list.add(Images("David Park","Giants game?","any interest?",R.drawable.ic_star))
//    list.add(Images("Bruce Wayne","Rounds?","inside gotham",R.drawable.ic_star))
//    list.add(Images("Clar Kent","Flying?","Around Smallville",R.drawable.ic_star))

        list.add(ImageList(R.mipmap.ic_pant,"Pant","Rs.5000"))
        list.add(ImageList(R.mipmap.ic_shirt,"Shirt","Rs.2000"))
        list.add(ImageList(R.mipmap.ic_ps,"Play Station","Rs.20000"))
        list.add(ImageList(R.mipmap.ic_ball,"Football","Rs.1000"))
        list.add(ImageList(R.mipmap.ic_bat,"Cricket Bat","Rs.500"))
        list.add(ImageList(R.mipmap.ic_shoe,"Shoe","Rs.1500"))
        list.add(ImageList(R.mipmap.ic_phone_foreground,"Phone","Rs.15000"))
        list.add(ImageList(R.mipmap.ic_bags_foreground,"Bag","Rs.1500"))
        list.add(ImageList(R.drawable.ic_shopping_basket,"Basket","Rs.250"))
    }
}

