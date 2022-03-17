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

/** BIMobject */
object FA_BIMOBJECT: Icon {
	
	override val name get() = "BIMobject"
	
	override val unicode get() = "f378"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M416 32H32C14.4 32 0 46.4 0 64v384c0 17.6 14.4 32 32 32h384c17.6 0 32-14.4 32-32V64c0-17.6-14.4-32-32-32zm-64 257.4c0 49.4-11.4 82.6-103.8 82.6h-16.9c-44.1 0-62.4-14.9-70.4-38.8h-.9V368H96V136h64v74.7h1.1c4.6-30.5 39.7-38.8 69.7-38.8h17.3c92.4 0 103.8 33.1 103.8 82.5v35zm-64-28.9v22.9c0 21.7-3.4 33.8-38.4 33.8h-45.3c-28.9 0-44.1-6.5-44.1-35.7v-19c0-29.3 15.2-35.7 44.1-35.7h45.3c35-.2 38.4 12 38.4 33.7z"/></svg>"""
		else -> null
	}
	
}
