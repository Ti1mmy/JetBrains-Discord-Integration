/*
 * Copyright 2017-2020 Aljoscha Grebe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.almightyalpaca.jetbrains.plugins.discord.plugin.source.bintray

import com.almightyalpaca.jetbrains.plugins.discord.icons.matcher.Matcher
import com.almightyalpaca.jetbrains.plugins.discord.icons.source.Language
import com.almightyalpaca.jetbrains.plugins.discord.icons.source.LanguageMatch
import com.almightyalpaca.jetbrains.plugins.discord.icons.source.abstract.AbstractLanguage

object BintrayLanguage {
    class Simple(id: String, name: String, parent: Language?, assetIds: List<String>?, matchers: Map<Matcher.Target, Matcher>) : AbstractLanguage.Simple(id, name, parent, assetIds, matchers) {
        override val match: LanguageMatch = BintrayLanguageMatch(name, this.assetIds)
    }

    class Default(name: String, assetId: String) : AbstractLanguage.Default(name, assetId) {
        override val match: LanguageMatch = BintrayLanguageMatch(name, assetIds)
    }
}
