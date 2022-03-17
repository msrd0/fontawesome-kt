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

object FA_PASSPORT: Icon {
	
	override val name get() = "Passport"
	
	override val unicode get() = "f5ab"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M129.6 208c5.25 31.25 25.62 57.13 53.25 70.38C175.3 259.4 170.3 235 168.8 208H129.6zM129.6 176h39.13c1.5-27 6.5-51.38 14.12-70.38C155.3 118.9 134.9 144.8 129.6 176zM224 286.8C231.8 279.3 244.8 252.3 247.4 208H200.5C203.3 252.3 216.3 279.3 224 286.8zM265.1 105.6C272.8 124.6 277.8 149 279.3 176h39.13C313.1 144.8 292.8 118.9 265.1 105.6zM384 0H64C28.65 0 0 28.65 0 64v384c0 35.35 28.65 64 64 64h320c35.2 0 64-28.8 64-64V64C448 28.8 419.2 0 384 0zM336 416h-224C103.3 416 96 408.8 96 400S103.3 384 112 384h224c8.75 0 16 7.25 16 16S344.8 416 336 416zM224 320c-70.75 0-128-57.25-128-128s57.25-128 128-128s128 57.25 128 128S294.8 320 224 320zM265.1 278.4c27.62-13.25 48-39.13 53.25-70.38h-39.13C277.8 235 272.8 259.4 265.1 278.4zM200.6 176h46.88C244.7 131.8 231.8 104.8 224 97.25C216.3 104.8 203.2 131.8 200.6 176z"/></svg>"""
		else -> null
	}
	
}
