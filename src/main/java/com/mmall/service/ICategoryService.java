package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import javax.naming.directory.SearchResult;
import java.util.List;

/**
 * Created by hao on 2017/8/17.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName,Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);


}
