package com.github.coyclab.discounthunter.parser;

import com.github.coyclab.discounthunter.model.product.IProductList;

public interface IProductListParser {

    IProductList parse() throws Exception;
}
