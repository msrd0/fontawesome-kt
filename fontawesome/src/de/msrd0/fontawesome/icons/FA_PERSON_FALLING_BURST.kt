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

object FA_PERSON_FALLING_BURST: Icon {
	
	override val name get() = "Person Falling Burst"
	
	override val unicode get() = "e547"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M256 41.84C256 96.45 228.1 146.5 183.5 175.4L183.7 175.8L240.5 255.1H311.1C327.1 255.1 341.3 263.1 350.4 275.2L393.6 332.8C404.2 346.9 401.3 366.1 387.2 377.6C373.1 388.2 353 385.3 342.4 371.2L303.1 319.1H222.6L314.9 462.6C324.5 477.5 320.2 497.3 305.4 506.9C290.5 516.5 270.7 512.2 261.1 497.4L100.5 249.2C97.57 258.4 95.1 268.1 95.1 278.2V351.1C95.1 369.7 81.67 383.1 63.1 383.1C46.33 383.1 31.1 369.7 31.1 351.1V278.2C31.1 213 71.65 154.5 132.1 130.3C168.3 115.8 191.1 80.79 191.1 41.84V32C191.1 14.33 206.3 0 223.1 0C241.7 0 255.1 14.33 255.1 32L256 41.84zM96 79.1C96 106.5 74.51 127.1 48 127.1C21.49 127.1 0 106.5 0 79.1C0 53.49 21.49 31.1 48 31.1C74.51 31.1 96 53.49 96 79.1zM464 286.1L424.7 322.2C423.1 319.3 421.3 316.4 419.2 313.6L382.1 265.3L384.2 247.6L365.8 244.8C351.2 231.5 332.1 223.1 311.1 223.1H292.6C292.5 223.7 292.5 223.4 292.4 223.2C290.1 216.8 293.5 210.1 298.9 206.4L364.5 161.3L325 92.18C321.8 86.49 322.3 79.39 326.4 74.27C330.5 69.14 337.3 67.03 343.6 68.93L419.7 92.05L449.1 18.09C451.6 11.1 457.4 8 464 8C470.6 8 476.4 11.1 478.9 18.09L508.3 92.05L584.4 68.93C590.7 67.03 597.5 69.14 601.6 74.27C605.7 79.39 606.2 86.49 602.1 92.18L563.5 161.3L629.1 206.4C634.5 210.1 637 216.8 635.6 223.2C634.1 229.6 628.9 234.4 622.4 235.4L543.8 247.6L549.4 327C549.8 333.6 546.3 339.7 540.4 342.6C534.5 345.4 527.4 344.4 522.6 339.9L464 286.1z"/></svg>"""
		else -> null
	}
	
}
