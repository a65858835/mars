/**
 *    Copyright 2020-present  Shanghai Jinmu Information Technology Co., Ltd.
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the Server Side Public License, version 1,
 *    as published by Shanghai Jinmu Information Technology Co., Ltd.(The name of the development team is Whaleal.)
 *
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    Server Side Public License for more details.
 *
 *    You should have received a copy of the Server Side Public License
 *    along with this program. If not, see
 *    <http://www.whaleal.com/licensing/server-side-public-license>.
 *
 *    As a special exception, the copyright holders give permission to link the
 *    code of portions of this program with the OpenSSL library under certain
 *    conditions as described in each individual source file and distribute
 *    linked combinations including the program with the OpenSSL library. You
 *    must comply with the Server Side Public License in all respects for
 *    all of the code used other than as permitted herein. If you modify file(s)
 *    with this exception, you may extend this exception to your version of the
 *    file(s), but you are not obligated to do so. If you do not wish to do so,
 *    delete this exception statement from your version. If you delete this
 *    exception statement from all source files in the program, then also delete
 *    it in the license file.
 */
package com.whaleal.mars.session.option;

import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import org.bson.conversions.Bson;

/**
 * @author cx
 * @Date 2020/12/15
 */
public class GraphLookupOptions implements ReadConfigurable<GraphLookupOptions> {

    private ReadConcern readConcern;

    private ReadPreference readPreference;

    private com.mongodb.client.model.GraphLookupOptions originGraphLookupOptions;

    public GraphLookupOptions() {
        originGraphLookupOptions = new com.mongodb.client.model.GraphLookupOptions();
    }

    public GraphLookupOptions(com.mongodb.client.model.GraphLookupOptions originGraphLookupOptions) {
        this.originGraphLookupOptions = originGraphLookupOptions;
    }


    public String getDepthField() {
        return originGraphLookupOptions.getDepthField();
    }


    public Integer getMaxDepth() {
        return originGraphLookupOptions.getMaxDepth();
    }


    public Bson getRestrictSearchWithMatch() {
        return originGraphLookupOptions.getRestrictSearchWithMatch();
    }


    public GraphLookupOptions depthField( String field ) {
        originGraphLookupOptions.depthField(field);
        return this;
    }

    public GraphLookupOptions maxDepth( Integer max ) {
        originGraphLookupOptions.maxDepth(max);
        return this;
    }

    public GraphLookupOptions restrictSearchWithMatch( Bson filter ) {
        originGraphLookupOptions.restrictSearchWithMatch(filter);
        return this;
    }

    @Override
    public ReadConcern getReadConcern() {
        return readConcern;
    }

    @Override
    public ReadPreference getReadPreference() {
        return readPreference;
    }

    @Override
    public GraphLookupOptions readConcern(ReadConcern readConcern) {
        this.readConcern = readConcern;
        return this;
    }

    @Override
    public GraphLookupOptions readPreference(ReadPreference readPreference) {
        this.readPreference = readPreference;
        return this;
    }

    @Override
    public com.mongodb.client.model.GraphLookupOptions getOriginOptions() {
        if (originGraphLookupOptions == null) {
            originGraphLookupOptions = new com.mongodb.client.model.GraphLookupOptions();
        }
        return originGraphLookupOptions;
    }
}
