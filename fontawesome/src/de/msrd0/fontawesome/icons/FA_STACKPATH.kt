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

/** Stackpath */
object FA_STACKPATH: Icon {
	
	override val name get() = "Stackpath"
	
	override val unicode get() = "f842"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M244.6 232.4c0 8.5-4.26 20.49-21.34 20.49h-19.61v-41.47h19.61c17.13 0 21.34 12.36 21.34 20.98zM448 32v448H0V32zM151.3 287.84c0-21.24-12.12-34.54-46.72-44.85-20.57-7.41-26-10.91-26-18.63s7-14.61 20.41-14.61c14.09 0 20.79 8.45 20.79 18.35h30.7l.19-.57c.5-19.57-15.06-41.65-51.12-41.65-23.37 0-52.55 10.75-52.55 38.29 0 19.4 9.25 31.29 50.74 44.37 17.26 6.15 21.91 10.4 21.91 19.48 0 15.2-19.13 14.23-19.47 14.23-20.4 0-25.65-9.1-25.65-21.9h-30.8l-.18.56c-.68 31.32 28.38 45.22 56.63 45.22 29.98 0 51.12-13.55 51.12-38.29zm125.38-55.63c0-25.3-18.43-45.46-53.42-45.46h-51.78v138.18h32.17v-47.36h19.61c30.25 0 53.42-15.95 53.42-45.36zM297.94 325L347 186.78h-31.09L268 325zm106.52-138.22h-31.09L325.46 325h29.94z"/></svg>"""
		else -> null
	}
	
}
