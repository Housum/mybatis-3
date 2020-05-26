/**
 * Copyright 2009-2015 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.session;

import org.apache.ibatis.executor.resultset.DefaultResultSetHandler;

/**
 * MyBatis分页对象
 * https://blog.csdn.net/wsjzzcbq/article/details/83447948
 *
 * 但是其实现有很大的性能问题,实现方式是将其全部查询出来 然后将不需要的那部分跳过
 * @see org.apache.ibatis.executor.resultset.DefaultResultSetHandler#shouldProcessMoreRows(org.apache.ibatis.session.ResultContext, org.apache.ibatis.session.RowBounds)
 * @see DefaultResultSetHandler#skipRows(java.sql.ResultSet, org.apache.ibatis.session.RowBounds)
 *
 * @author Clinton Begin
 */
public class RowBounds {

    public static final int NO_ROW_OFFSET = 0;
    public static final int NO_ROW_LIMIT = Integer.MAX_VALUE;
    public static final RowBounds DEFAULT = new RowBounds();

    private int offset;
    private int limit;

    public RowBounds() {
        this.offset = NO_ROW_OFFSET;
        this.limit = NO_ROW_LIMIT;
    }

    public RowBounds(int offset, int limit) {
        this.offset = offset;
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

}
