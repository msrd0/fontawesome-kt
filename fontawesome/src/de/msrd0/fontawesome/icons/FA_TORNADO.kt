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

object FA_TORNADO: Icon {
	
	override val name get() = "Tornado"
	
	override val unicode get() = "f76f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M407.8 42.09c7.531-6.562 10.22-17.12 6.688-26.5C410.1 6.219 401.1 0 391.1 0L24.16 .0313c-13 0-23.66 10.38-24 23.38C-.5495 50.32 1.349 74.22 4.945 95.98h353.9C367.9 80.76 383.4 63.34 407.8 42.09zM387.7 195.9c-22.02-25.33-38.96-44.87-39-67.93H12.05c11.47 40.4 30.38 71.34 53.15 96h345.8C403.4 214.1 395.4 204.8 387.7 195.9zM303.6 485.3c-1.125 10.12 4.249 19.84 13.44 24.28C320.3 511.2 323.9 512 327.4 512c6.219 0 12.34-2.406 16.94-7c43.73-43.61 73.32-83.63 89.35-121h-148.6C300.8 408.6 308.7 440 303.6 485.3zM431.7 255.1H100.5C127.1 276.3 155.8 291.6 182.4 305.8c28.14 15.01 54.04 28.9 74.73 46.14h186.8C446.4 341.1 447.1 330.4 448 320C448 295.4 441.4 274.6 431.7 255.1z"/></svg>"""
		else -> null
	}
	
}
