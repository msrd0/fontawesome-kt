/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.BRANDS

/** Steam Symbol */
object FA_STEAM_SYMBOL: Icon {
	
	override val name get() = "Steam Symbol"
	
	override val unicode get() = "f3f6"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M395.5 177.5c0 33.8-27.5 61-61 61-33.8 0-61-27.3-61-61s27.3-61 61-61c33.5 0 61 27.2 61 61zm52.5.2c0 63-51 113.8-113.7 113.8L225 371.3c-4 43-40.5 76.8-84.5 76.8-40.5 0-74.7-28.8-83-67L0 358V250.7L97.2 290c15.1-9.2 32.2-13.3 52-11.5l71-101.7c.5-62.3 51.5-112.8 114-112.8C397 64 448 115 448 177.7zM203 363c0-34.7-27.8-62.5-62.5-62.5-4.5 0-9 .5-13.5 1.5l26 10.5c25.5 10.2 38 39 27.7 64.5-10.2 25.5-39.2 38-64.7 27.5-10.2-4-20.5-8.3-30.7-12.2 10.5 19.7 31.2 33.2 55.2 33.2 34.7 0 62.5-27.8 62.5-62.5zm207.5-185.3c0-42-34.3-76.2-76.2-76.2-42.3 0-76.5 34.2-76.5 76.2 0 42.2 34.3 76.2 76.5 76.2 41.9.1 76.2-33.9 76.2-76.2z"/></svg>"""
		else -> null
	}
	
}
