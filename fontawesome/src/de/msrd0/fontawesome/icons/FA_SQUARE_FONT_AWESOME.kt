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

/** Font Awesome in Square */
object FA_SQUARE_FONT_AWESOME: Icon {
	
	override val name get() = "Font Awesome in Square"
	
	override val unicode get() = "f425"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M384.5,32.5h-320c-35.3,0-64,28.7-64,64v320c0,35.3,28.7,64,64,64h320c35.3,0,64-28.7,64-64v-320 C448.5,61.2,419.8,32.5,384.5,32.5z M336.5,312.5c-31.6,11.2-41.2,16-59.8,16c-31.4,0-43.2-16-74.6-16c-10.2,0-18.2,1.6-25.6,4v-32 c7.4-2.2,15.4-4,25.6-4c31.2,0,43.2,16,74.6,16c10.2,0,17.8-1.4,27.8-4.6v-96c-10,3.2-17.6,4.6-27.8,4.6c-31.4,0-43.2-16-74.6-16 c-25.4,0-37.4,10.4-57.6,14.4v153.6c0,8.8-7.2,16-16,16c-8.8,0-16-7.2-16-16v-192c0-8.8,7.2-16,16-16c8.8,0,16,7.2,16,16v6.4 c20.2-4,32.2-14.4,57.6-14.4c31.2,0,43.2,16,74.6,16c18.6,0,28.2-4.8,59.8-16V312.5z"/></svg>"""
		else -> null
	}
	
}
