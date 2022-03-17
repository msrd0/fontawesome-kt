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

/** Hill Rockslide */
object FA_HILL_ROCKSLIDE: Icon {
	
	override val name get() = "Hill Rockslide"
	
	override val unicode get() = "e508"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M252.4 103.8C249.7 98.97 249.7 93.03 252.4 88.16L279.4 40.16C282.2 35.12 287.6 32 293.4 32H346.6C352.4 32 357.8 35.12 360.6 40.16L387.6 88.16C390.3 93.03 390.3 98.97 387.6 103.8L360.6 151.8C357.8 156.9 352.4 160 346.6 160H293.4C287.6 160 282.2 156.9 279.4 151.8L252.4 103.8zM424.1 443.7C450.2 468.9 432.3 512 396.7 512H80C35.82 512 0 476.2 0 432V115.3C0 79.68 43.09 61.83 68.28 87.03L424.1 443.7zM456.2 376.6C451.1 373.8 448 368.4 448 362.6V309.4C448 303.6 451.1 298.2 456.2 295.4L504.2 268.4C509 265.7 514.1 265.7 519.8 268.4L567.8 295.4C572.9 298.2 576 303.6 576 309.4V362.6C576 368.4 572.9 373.8 567.8 376.6L519.8 403.6C514.1 406.3 509 406.3 504.2 403.6L456.2 376.6zM192 64C192 81.67 177.7 96 160 96C142.3 96 128 81.67 128 64C128 46.33 142.3 32 160 32C177.7 32 192 46.33 192 64zM352 256C352 238.3 366.3 224 384 224C401.7 224 416 238.3 416 256C416 273.7 401.7 288 384 288C366.3 288 352 273.7 352 256z"/></svg>"""
		else -> null
	}
	
}
