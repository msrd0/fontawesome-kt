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

object FA_SQUARE_PERSON_CONFINED: Icon {
	
	override val name get() = "Square Person-confined"
	
	override val unicode get() = "e577"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M384 32C419.3 32 448 60.65 448 96V416C448 451.3 419.3 480 384 480H64C28.65 480 0 451.3 0 416V96C0 60.65 28.65 32 64 32H384zM208 96C181.5 96 160 117.5 160 144C160 170.5 181.5 192 208 192C234.5 192 256 170.5 256 144C256 117.5 234.5 96 208 96zM240 306.7L198.6 265.4C191.4 258.1 181 254.8 170.9 256.4C160.7 258.1 151.1 264.5 147.4 273.7L99.39 369.7C91.48 385.5 97.89 404.7 113.7 412.6C129.5 420.5 148.7 414.1 156.6 398.3L184.8 342L239.4 396.7C251.8 409.1 268.6 416 286.1 416C322.5 416 352 386.5 352 350.1V248C352 217.1 326.9 192 296 192C265.1 192 240 217.1 240 248V306.7z"/></svg>"""
		else -> null
	}
	
}
