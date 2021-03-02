package com.example.tp06_android.dal.utils

import com.example.tp06_android.dal.online.models.SourceItem
import com.example.tp06_android.models.Source

fun SourceItem.toSource() = Source(
    id = id,
    name = name
)

fun Source.toSourceItem() = SourceItem(
    id = id,
    name = name
)
