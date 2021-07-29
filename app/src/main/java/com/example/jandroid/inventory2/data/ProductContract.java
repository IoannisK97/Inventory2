package com.example.jandroid.inventory2.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;



public final class ProductContract {

    public static final String LOG_TAG = ProductProvider.class.getSimpleName();

    private ProductContract() {
    }


    /**
     * Building URI
     */
    // authority
    public static final String CONTENT_AUTHORITY = "com.example.jandroid.inventory2";
    // base content URI
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    // path to table name
    public static final String PATH_PRODUCTS = "inventory2";


    public static abstract class ProductEntry implements BaseColumns {

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;


        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PRODUCTS);


        public final static String TABLE_NAME = "inventoryapp";


        public final static String _ID = BaseColumns._ID;


        public final static String COLUMN_PRODUCT_NAME = "name";



        public final static String COLUMN_PRODUCT_MODEL = "model";


        public final static String COLUMN_PRODUCT_GRADE = "grade";


        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";


        public static final String COLUMN_PRODUCT_PICTURE = "picture";


        public final static String COLUMN_PRODUCT_PRICE = "price";


        public final static String COLUMN_SUPPLIER_NAME = "supplierName";


        public final static String COLUMN_SUPPLIER_EMAIL = "supplierEmail";


        public static final int GRADE_UNKNOWN = 0;
        public static final int GRADE_NEW = 1;
        public static final int GRADE_USED = 2;


        public static boolean isValidGrade(int grade) {
            if (grade == GRADE_UNKNOWN || grade == GRADE_NEW || grade == GRADE_USED) {
                return true;
            }
            return false;
        }
    }
}
