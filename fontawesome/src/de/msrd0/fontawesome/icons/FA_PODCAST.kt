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

/** Podcast */
object FA_PODCAST: Icon {
	
	override val name get() = "Podcast"
	
	override val unicode get() = "f2ce"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M224 0C100.3 0 0 100.3 0 224c0 92.22 55.77 171.4 135.4 205.7c-3.48-20.75-6.17-41.59-6.998-58.15C80.08 340.1 48 285.8 48 224c0-97.05 78.95-176 176-176s176 78.95 176 176c0 61.79-32.08 116.1-80.39 147.6c-.834 16.5-3.541 37.37-7.035 58.17C392.2 395.4 448 316.2 448 224C448 100.3 347.7 0 224 0zM224 312c-32.88 0-64 8.625-64 43.75c0 33.13 12.88 104.3 20.62 132.8C185.8 507.6 205.1 512 224 512s38.25-4.375 43.38-23.38C275.1 459.9 288 388.8 288 355.8C288 320.6 256.9 312 224 312zM224 280c30.95 0 56-25.05 56-56S254.1 168 224 168S168 193 168 224S193 280 224 280zM368 224c0-79.53-64.47-144-144-144S80 144.5 80 224c0 44.83 20.92 84.38 53.04 110.8c4.857-12.65 14.13-25.88 32.05-35.04C165.1 299.7 165.4 299.7 165.6 299.7C142.9 282.1 128 254.9 128 224c0-53.02 42.98-96 96-96s96 42.98 96 96c0 30.92-14.87 58.13-37.57 75.68c.1309 .0254 .5078 .0488 .4746 .0742c17.93 9.16 27.19 22.38 32.05 35.04C347.1 308.4 368 268.8 368 224z"/></svg>"""
		else -> null
	}
	
}
