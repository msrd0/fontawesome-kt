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

object FA_PIED_PIPER_HAT__OLD_: Icon {
	
	override val name get() = "Pied Piper Hat (Old)"
	
	override val unicode get() = "f4e5"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M640 24.9c-80.8 53.6-89.4 92.5-96.4 104.4-6.7 12.2-11.7 60.3-23.3 83.6-11.7 23.6-54.2 42.2-66.1 50-11.7 7.8-28.3 38.1-41.9 64.2-108.1-4.4-167.4 38.8-259.2 93.6 29.4-9.7 43.3-16.7 43.3-16.7 94.2-36 139.3-68.3 281.1-49.2 1.1 0 1.9.6 2.8.8 3.9 2.2 5.3 6.9 3.1 10.8l-53.9 95.8c-2.5 4.7-7.8 7.2-13.1 6.1-126.8-23.8-226.9 17.3-318.9 18.6C24.1 488 0 453.4 0 451.8c0-1.1.6-1.7 1.7-1.7 0 0 38.3 0 103.1-15.3C178.4 294.5 244 245.4 315.4 245.4c0 0 71.7 0 90.6 61.9 22.8-39.7 28.3-49.2 28.3-49.2 5.3-9.4 35-77.2 86.4-141.4 51.5-64 90.4-79.9 119.3-91.8z"/></svg>"""
		else -> null
	}
	
}
