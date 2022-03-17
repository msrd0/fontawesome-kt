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
import de.msrd0.fontawesome.Style.SOLID

object FA_YEN_SIGN: Icon {
	
	override val name get() = "Yen Sign"
	
	override val unicode get() = "f157"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M159.1 198.3L261.4 46.25C271.2 31.54 291 27.57 305.8 37.37C320.5 47.18 324.4 67.04 314.6 81.75L219.8 223.1H272C289.7 223.1 304 238.3 304 255.1C304 273.7 289.7 287.1 272 287.1H192V319.1H272C289.7 319.1 304 334.3 304 352C304 369.7 289.7 384 272 384H192V448C192 465.7 177.7 480 159.1 480C142.3 480 127.1 465.7 127.1 448V384H47.1C30.33 384 15.1 369.7 15.1 352C15.1 334.3 30.33 319.1 47.1 319.1H127.1V287.1H47.1C30.33 287.1 15.1 273.7 15.1 255.1C15.1 238.3 30.33 223.1 47.1 223.1H100.2L5.374 81.75C-4.429 67.04-.456 47.18 14.25 37.37C28.95 27.57 48.82 31.54 58.62 46.25L159.1 198.3z"/></svg>"""
		else -> null
	}
	
}

val FA_CNY = FA_YEN_SIGN

val FA_JPY = FA_YEN_SIGN

val FA_RMB = FA_YEN_SIGN

val FA_YEN = FA_YEN_SIGN
