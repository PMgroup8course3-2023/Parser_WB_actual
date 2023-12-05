package DB_Objects.Product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    int __sort;
    int ksort;
    int time1;
    int time2;
    int dist;
    int id;
    int root;
    int kindId;
    int subjectId;
    int subjectParentId;
    String name;
    String brand;
    int brandId;
    int siteBrandId;
    String supplier;
    int supplierId;
    double supplierRating;
    int sale;
    int priceU;
    int salePriceU;
    int logisticsCost;
    int saleConditions;
    int returnCost;
    int pics;
    int rating;
    double reviewRating;
    int feedbacks;
    int panelPromoId;
    String promoTextCard;
    String promoTextCat;
    int volume;
    int viewFlags;
    ArrayList<ProductColor> colors;
    ArrayList<ProductSize> sizes;
    boolean diffPrice;
    ProductLog log;
}
