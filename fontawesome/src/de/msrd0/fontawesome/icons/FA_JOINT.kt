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

object FA_JOINT: Icon {
	
	override val name get() = "Joint"
	
	override val unicode get() = "f595"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M444.4 181.1C466.8 196.8 480 222.2 480 249.8V280C480 284.4 483.6 288 488 288h48C540.4 288 544 284.4 544 280V249.8c0-43.25-21-83.5-56.38-108.1C463.9 125 448 99.38 448 70.25V8C448 3.625 444.4 0 440 0h-48C387.6 0 384 3.625 384 8v66.38C384 118.1 408.5 156 444.4 181.1zM195 359C125.1 370.1 59.75 394.8 0 432C83.62 484.2 180.2 512 279 512h88.5l-112.7-131.5C240 363.2 217.4 355.4 195 359zM553.3 87.12C547.6 83.25 544 77.12 544 70.25V8C544 3.625 540.4 0 536 0h-48C483.6 0 480 3.625 480 8v62.25c0 22.13 10.12 43.5 28.62 55.5C550.8 153 576 199.5 576 249.8V280C576 284.4 579.6 288 584 288h48C636.4 288 640 284.4 640 280V249.8C640 184.2 607.6 123.5 553.3 87.12zM360.9 352c-34.38 .125-86.75 .25-88.25 .25l117.9 137.4C402.6 503.9 420.4 512 439.1 512h88.38l-117.9-137.6C397.4 360.1 379.6 352 360.9 352zM616 352H432l117.1 137.6C562.1 503.9 579.9 512 598.6 512H616c13.25 0 24-10.75 24-24v-112C640 362.8 629.3 352 616 352z"/></svg>"""
		else -> null
	}
	
}
