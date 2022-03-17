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

/** Bong */
object FA_BONG: Icon {
	
	override val name get() = "Bong"
	
	override val unicode get() = "f55c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M334.5 512c23.12 0 44.38-12.62 56-32.63C406.8 451.2 416 418.8 416 384c0-36.13-10.11-69.75-27.49-98.63l43.5-43.37l9.376 9.375c6.25 6.25 16.38 6.25 22.63 0L475.3 240c6.25-6.25 6.25-16.38 0-22.62l-52.63-52.75c-6.25-6.25-16.38-6.25-22.63 0L388.6 176c-6.25 6.25-6.25 16.38 0 22.62L398 208l-39.38 39.38c-11.5-11.38-24.51-21.25-38.63-29.5l.0067-154.1h16c8.75 0 16-7.25 16-16L352 16.01C352 7.14 344.9 0 336 0L111.1 .1667c-8.75 0-15.99 7.11-15.99 15.99L96 48c0 8.875 7.126 16 16 16h16L128 217.9C70.63 251.1 32 313 32 384c0 34.75 9.252 67.25 25.5 95.38C69.13 499.4 90.38 512 113.5 512H334.5zM152 259.4l23.97-13.87V64.03L272 63.75l.0168 181.8l23.97 13.87C320.7 273.8 340 295.1 352.5 320H95.51C108 295.1 127.3 273.8 152 259.4z"/></svg>"""
		else -> null
	}
	
}
