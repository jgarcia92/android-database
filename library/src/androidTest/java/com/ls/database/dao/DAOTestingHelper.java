/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Lemberg Solutions
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.ls.database.dao;

import com.ls.database.Queries;
import com.ls.database.TableInfo;
import com.ls.database.model.IDBHelper;
import com.ls.database.model.IMigrationTask;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Stanislav Bodnar, Lemberg Solutions
 */
public class DAOTestingHelper implements IDBHelper {

    public static final String DB_NAME = "dao_test_database.db";
    public static final int DB_VERSION = 1;

    @Override
    public List<TableInfo> getTables(Context context) {
        List<TableInfo> list = new ArrayList<>();

        list.add(new TableInfo(Queries.CREATE_TABLE_DAO_TESTS, Queries.DROP_TABLE_DAO_TESTS));

        return list;
    }

    @Override
    public void onConfigure(Context context, SQLiteDatabase database) {

    }

    @Override
    public void onOpen(Context context, SQLiteDatabase database) {

    }

    @Override
    public Map<Integer, IMigrationTask> getUpgradeMigrationTasks(Context context) {
        return new LinkedHashMap<>();
    }

    @Override
    public void onUpgradeMigrationFailed(Context context, SQLiteDatabase database, int oldVersion, int newVersion) {

    }

    @Override
    public Map<Integer, IMigrationTask> getDowngradeMigrationTasks(Context context) {
        return new LinkedHashMap<>();
    }

    @Override
    public void onDowngradeMigrationFailed(Context context, SQLiteDatabase database, int oldVersion, int newVersion) {

    }

    @Override
    public String getDatabaseName(Context context) {
        return DB_NAME;
    }

    @Override
    public int getDatabaseVersion(Context context) {
        return DB_VERSION;
    }
}
