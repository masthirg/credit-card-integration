/*
 * Copyright (c) 2021, LOLC Technologies and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

/*-
 * Instructions to maintain version history.
 *
 * #                        :- A running number, each time a modification is applied, this will get increased.
 * Version No               :- For java files, version no should increment by one.
 * URS / Help Desk No       :- URS or help desk no which is cause to modify this file.
 * Date                     :- The modified date.
 * Author                   :- The person who modify the code.
 * Description              :- Brief description about the changes.
 *
 *     #        Version No        URS/Help Desk No        Date            	Author            Description
 * -----------------------------------------------------------------------------------------------------------------
 *    1        1.0.0                   MD-50              02-Jan-2021       NadeenG           Project Initiated.
 *
 */

package com.loits;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

}
